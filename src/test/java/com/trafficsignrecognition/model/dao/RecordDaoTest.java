package com.trafficsignrecognition.model.dao;

import org.junit.Ignore;
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
public class RecordDaoTest {

    @Autowired
    private RecordDao recordDao;

    @Test
    @Ignore
    public void testGetHistoryRecords() {
        System.out.println(recordDao.getHistoryRecords());
    }

    @Test
    @Ignore
    public void testInsertRecord() {
        int classname = 0;
        double accuracy = 0.88;
        boolean accept = true;
        String imageURL = "/tmp/00000_00000.jpg";
        String time = "1111 11111";

        recordDao.insertRecord(classname, accuracy, accept, imageURL, time);
    }

}