package com.trafficsignrecognition.model.service.mock;

import com.trafficsignrecognition.model.beans.HistoryRecordBean;
import com.trafficsignrecognition.model.beans.PredictionResultUnit;
import com.trafficsignrecognition.model.domain.RecordUnit;
import com.trafficsignrecognition.model.service.RecordHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("mock")
public class MockRecordHandler implements RecordHandler{
    @Override
    public HistoryRecordBean getHistoryRecords() {

        HistoryRecordBean historyRecordBean = new HistoryRecordBean();

        RecordUnit unit1 = new RecordUnit();
        unit1.setClassname(0);
        unit1.setAccuracy(0.9);
        unit1.setAccept(true);
        unit1.setImageURL("http://localhost:8080/00000_00000.jpg");
        unit1.setTime("2018-18-29T3:33:9Z");

        RecordUnit unit2 = new RecordUnit();
        unit2.setClassname(1);
        unit2.setAccuracy(0.2);
        unit2.setAccept(false);
        unit2.setImageURL("http://localhost:8080/00000_00000.jpg");
        unit2.setTime("2018-18-29T3:33:9Z");

        List<RecordUnit> units = new ArrayList<>();
        units.add(unit1);
        units.add(unit2);

        historyRecordBean.setRecords(units);

        return historyRecordBean;
    }

    @Override
    public void addNewRecord(PredictionResultUnit unit, String filePath) {
        System.out.println("add user's upload file.");
    }
}
