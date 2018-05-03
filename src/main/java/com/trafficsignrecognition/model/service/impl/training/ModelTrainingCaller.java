package com.trafficsignrecognition.model.service.impl.training;

import com.trafficsignrecognition.properties.PathProperty;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/2.
 */

@Component
public class ModelTrainingCaller {

    private static final String TRAINING_COMMAND_RAW = "";
    private static String TRAINING_COMMAND;

    public void setTrainingCommand(PathProperty pathProperty) {

    }

    public void train() {
        try {
            Process ps = Runtime.getRuntime().exec(TRAINING_COMMAND);
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
