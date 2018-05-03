package com.trafficsignrecognition.properties;

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
public class PathPropertyTest {

    @Autowired
    private PathProperty pathProperty;

    @Test
    @Ignore
    public void testGetAcceptedDir() {
        System.out.println(pathProperty.getAcceptDir());
    }
}