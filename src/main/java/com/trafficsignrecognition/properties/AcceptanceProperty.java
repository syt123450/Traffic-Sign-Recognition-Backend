package com.trafficsignrecognition.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/2.
 */

@Service
public class AcceptanceProperty {

    private static double THRESHOLD;
    private static int RETRAIN_NUMBER;

    @Value("${accept.threshold}")
    public void setThreshold(String threshold) {
        THRESHOLD = Double.parseDouble(threshold);
    }

    @Value("${accept.max}")
    public void setRetrainNumber(String retrainNumber) {
        RETRAIN_NUMBER = Integer.parseInt(retrainNumber);
    }

    public double getThreshold() {
        return THRESHOLD;
    }

    public int getRetrainNumber() {
        return RETRAIN_NUMBER;
    }
}
