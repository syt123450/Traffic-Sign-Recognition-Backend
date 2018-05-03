package com.trafficsignrecognition.model.service.impl;

import com.trafficsignrecognition.model.service.TrainingHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/2.
 */

@Service
@Profile("dev")
public class TrainingHandlerImpl implements TrainingHandler {

    public void train() {

    }
}
