package com.trafficsignrecognition.model.service.mock;

import com.trafficsignrecognition.model.service.TrainingHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/2.
 */

@Service
@Profile("mock")
public class MockTrainingHandler implements TrainingHandler {

    public void train() {
        System.out.println("Train a model.");
    }
}
