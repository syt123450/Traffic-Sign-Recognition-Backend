package com.trafficsignrecognition.model.service.mock;

import com.trafficsignrecognition.model.beans.HistoryRecordBean;
import com.trafficsignrecognition.model.beans.PredictionResultUnit;
import com.trafficsignrecognition.model.service.RecordHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("mock")
public class MockRecordHandler implements RecordHandler{
    @Override
    public HistoryRecordBean getHistoryRecords() {
        return null;
    }

    @Override
    public void addNewRecord(String fileName, PredictionResultUnit unit) {

    }
}
