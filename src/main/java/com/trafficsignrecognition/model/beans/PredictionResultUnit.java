package com.trafficsignrecognition.model.beans;

import lombok.Data;

/**
 * Created by ss on 2018/4/28.
 */

@Data
public class PredictionResultUnit {

    private int classID;
    private double accuracy;

    public int compareTo(PredictionResultUnit another) {
        if (this.getAccuracy() < another.getAccuracy()){
            return 1;
        } else {
            return -1;
        }
    }
}
