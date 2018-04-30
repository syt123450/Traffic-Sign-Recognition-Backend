package com.trafficsignrecognition.model.service.mock;

import com.trafficsignrecognition.model.beans.PredictionResponse;
import com.trafficsignrecognition.model.beans.PredictionResultUnit;
import com.trafficsignrecognition.model.service.PredictionHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("mock")
public class MockPredictionHandler implements PredictionHandler{
    @Override
    public PredictionResponse predict(MultipartFile file) {

        PredictionResponse response = new PredictionResponse();

        PredictionResultUnit unit1 = new PredictionResultUnit();
        unit1.setClassID(0);
        unit1.setAccuracy(0.5);

        PredictionResultUnit unit2 = new PredictionResultUnit();
        unit2.setClassID(1);
        unit2.setAccuracy(0.3);

        PredictionResultUnit unit3 = new PredictionResultUnit();
        unit3.setClassID(2);
        unit3.setAccuracy(0.2);

        List<PredictionResultUnit> units = new ArrayList<>();
        units.add(unit1);
        units.add(unit2);
        units.add(unit3);

        response.setResults(units);

        return response;
    }
}
