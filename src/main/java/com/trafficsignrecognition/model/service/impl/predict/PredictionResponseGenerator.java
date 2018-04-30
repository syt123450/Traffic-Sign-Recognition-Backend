package com.trafficsignrecognition.model.service.impl.predict;

import com.trafficsignrecognition.model.beans.PredictionResponse;
import com.trafficsignrecognition.model.beans.PredictionResultUnit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/4/28.
 */
public class PredictionResponseGenerator {

    public static PredictionResponse generate(List<String> predictResult) {

        PredictionResponse response = new PredictionResponse();

        List<PredictionResultUnit> resultBeans = new ArrayList<>();
        for (int i = 0; i < predictResult.size(); i++) {

            PredictionResultUnit predictionResultUnit = new PredictionResultUnit();

            String resultLine = predictResult.get(i);
            String[] separateResult = resultLine.split(" ");

            predictionResultUnit.setClassID(Integer.parseInt(separateResult[0]));
            predictionResultUnit.setAccuracy(Double.parseDouble(separateResult[1]));

            resultBeans.add(predictionResultUnit);
        }

        resultBeans.sort(PredictionResultUnit::compareTo);

        response.setResults(resultBeans.subList(0, 3));

        return response;

    }

}
