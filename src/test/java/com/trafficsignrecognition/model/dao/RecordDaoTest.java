package com.trafficsignrecognition.model.dao;

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
    public void testGetHistoryRecords() {
        System.out.println(recordDao.getHistoryRecords());
    }

}