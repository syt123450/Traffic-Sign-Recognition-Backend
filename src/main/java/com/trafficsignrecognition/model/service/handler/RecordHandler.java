package com.trafficsignrecognition.model.service.handler;

import com.trafficsignrecognition.model.beans.HistoryRecordBean;
import com.trafficsignrecognition.model.beans.PredictionResultUnit;
import com.trafficsignrecognition.model.dao.RecordDao;
import com.trafficsignrecognition.model.domain.RecordUnit;
import com.trafficsignrecognition.model.utils.PathUtils;
import com.trafficsignrecognition.model.utils.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Service
public class RecordHandler {

    @Autowired
    private RecordDao recordDao;
    @Autowired
    private Environment env;

    public HistoryRecordBean getHistoryRecords() {

        HistoryRecordBean historyRecordBean = new HistoryRecordBean();

        List<RecordUnit> recordUnitList = recordDao.getHistoryRecords();
        historyRecordBean.setRecords(recordUnitList);

        return historyRecordBean;

    }

    public void addNewRecord(String fileName, PredictionResultUnit unit) {

        double threshold = Double.parseDouble(env.getProperty("accept.threshold"));
        int classname = unit.getClassID();
        double accuracy = unit.getAccuracy();
        boolean accept = accuracy >= threshold;
        String imageURL = PathUtils.generateFrontendImagePath(fileName, env.getProperty("server.port"));
        String time = TimeUtils.getTimeNowInString();

        recordDao.insertRecord(classname, accuracy, accept, imageURL, time);
    }
}
