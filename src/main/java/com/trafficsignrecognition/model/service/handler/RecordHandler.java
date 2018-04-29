package com.trafficsignrecognition.model.service.handler;

import com.trafficsignrecognition.model.beans.HistoryRecordBean;
import com.trafficsignrecognition.model.dao.RecordDao;
import com.trafficsignrecognition.model.domain.RecordUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Service
public class RecordHandler {

    @Autowired
    private RecordDao recordDao;

    public HistoryRecordBean getHistoryRecords() {

        HistoryRecordBean historyRecordBean = new HistoryRecordBean();

        List<RecordUnit> recordUnitList = recordDao.getHistoryRecords();
        historyRecordBean.setRecords(recordUnitList);

        return historyRecordBean;

    }
}
