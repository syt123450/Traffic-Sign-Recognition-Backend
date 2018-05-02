package com.trafficsignrecognition.model.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by ss on 2018/5/2.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GraphicDaoTest {

    @Autowired
    private GraphicDao graphicDao;

    @Test
    @Ignore
    public void testGetModelPrecises() {
        System.out.println(graphicDao.getModelPrecises());
    }

    @Test
    @Ignore
    public void testGetClassPrecises() {
        System.out.println(graphicDao.getClassPrecises());
    }
}