package com.trafficsignrecognition.model.service.impl.loader;

import com.trafficsignrecognition.properties.PathProperty;
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
public class ImageLoaderTest {

    @Autowired
    private ImageLoader imageLoader;

    @Test
    @Ignore
    public void testLoadAccepted() {
        imageLoader.loadAccepted("bird.jpg", 0);
    }

    @Test
    @Ignore
    public void testLoadUnaccepted() {
        imageLoader.loadUnaccepted("bird.jpg");
    }
}