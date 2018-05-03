package com.trafficsignrecognition.model.service.impl.training;

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
public class TestResultReaderTest {

    @Autowired
    private TestResultReader testResultReader;

    @Test
    public void testRead() {
        System.out.println(testResultReader.read());
    }
}