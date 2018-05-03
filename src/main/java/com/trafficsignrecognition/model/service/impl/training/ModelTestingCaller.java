package com.trafficsignrecognition.model.service.impl.training;

import com.trafficsignrecognition.properties.PathProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/2.
 */

@Component
public class ModelTestingCaller {

    private static final String TEST_COMMAND_RAW = "";
    private static String TEST_COMMAND;

    @Autowired
    public void setTestCommand(PathProperty pathProperty) {

    }

    public void test() {
        try {
            Process ps = Runtime.getRuntime().exec(TEST_COMMAND);
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
