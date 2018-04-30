package com.trafficsignrecognition.model.service.impl.predict;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */
public class PredictionResponseGeneratorTest {

    @Test
    @Ignore
    public void testGenerate() {
        List<String> result = new ArrayList<>();
        result.add("11 0.111");
        result.add("22 0.333");
        result.add("33 0.222");

        System.out.println(PredictionResponseGenerator.generate(result));
    }
}