package com.trafficsignrecognition.model.service.handler;

import com.trafficsignrecognition.model.beans.PredictionResultUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by ss on 2018/4/29.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RecordHandlerTest {

    @Autowired
    private RecordHandler recordHandler;

    @Test
    public void testAddNewRecord() {

        String filePath = "/tmp/00000_00000.jpg";
        PredictionResultUnit unit = new PredictionResultUnit();
        unit.setClassID(1);
        unit.setAccuracy(0.7);

        recordHandler.addNewRecord(filePath, unit);
    }
}