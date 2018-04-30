package com.trafficsignrecognition.model.service.mock;

import com.trafficsignrecognition.model.beans.PredictionResponse;
import com.trafficsignrecognition.model.service.PredictionHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("mock")
public class MockPredictionHandler implements PredictionHandler{
    @Override
    public PredictionResponse predict(MultipartFile file) {
        return null;
    }
}
