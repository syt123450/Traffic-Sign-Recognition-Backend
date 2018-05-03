package com.trafficsignrecognition.model.service.impl;

import com.trafficsignrecognition.model.beans.HistoryRecordBean;
import com.trafficsignrecognition.model.beans.PredictionResultUnit;
import com.trafficsignrecognition.model.dao.CounterDao;
import com.trafficsignrecognition.model.dao.RecordDao;
import com.trafficsignrecognition.model.domain.RecordUnit;
import com.trafficsignrecognition.model.service.RecordHandler;
import com.trafficsignrecognition.model.service.TrainingHandler;
import com.trafficsignrecognition.model.utils.TimeUtils;
import com.trafficsignrecognition.properties.AcceptanceProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("dev")
public class RecordHandlerImpl implements RecordHandler {

    @Autowired
    private RecordDao recordDao;
    @Autowired
    private CounterDao counterDao;
    @Autowired
    private AcceptanceProperty acceptanceProperty;
    @Autowired
    private TrainingHandler trainingHandler;

    public HistoryRecordBean getHistoryRecords() {

        HistoryRecordBean historyRecordBean = new HistoryRecordBean();

        List<RecordUnit> recordUnitList = recordDao.getHistoryRecords();
        historyRecordBean.setRecords(recordUnitList);

        return historyRecordBean;

    }

    public void addNewRecord(PredictionResultUnit unit, String imagePath) {

        double threshold = acceptanceProperty.getThreshold();
        int classname = unit.getClassID();
        double accuracy = unit.getAccuracy();
        boolean accept = accuracy >= threshold;
        String time = TimeUtils.getTimeNowInString();

        recordDao.insertRecord(classname, accuracy, accept, imagePath, time);

        if (accept) {
            counterDao.addCounter();
            int count = counterDao.getCounter();
            if (count == acceptanceProperty.getRetrainNumber()) {
                trainingHandler.train();
            }
        }
    }
}
