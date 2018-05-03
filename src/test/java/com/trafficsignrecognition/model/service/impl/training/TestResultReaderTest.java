package com.trafficsignrecognition.model.service.impl.training;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ss on 2018/5/2.
 */
public class TestResultReaderTest {

    @Test
    public void testRead() {
        TestResultReader testResultReader = new TestResultReader();
        System.out.println(testResultReader.read());
    }
}