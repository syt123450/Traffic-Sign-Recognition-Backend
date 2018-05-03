package com.trafficsignrecognition.model.service;

import com.trafficsignrecognition.model.beans.HistoryRecordBean;
import com.trafficsignrecognition.model.beans.PredictionResultUnit;

/**
 * Created by ss on 2018/4/29.
 */
public interface RecordHandler {

    HistoryRecordBean getHistoryRecords();

    void addNewRecord(PredictionResultUnit unit, String filePath);
}
