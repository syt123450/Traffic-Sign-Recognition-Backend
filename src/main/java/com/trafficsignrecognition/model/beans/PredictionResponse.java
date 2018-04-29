package com.trafficsignrecognition.model.beans;

import lombok.Data;

import java.util.List;

/**
 * Created by ss on 2018/4/28.
 */

@Data
public class PredictionResponse {

    private String errorMessage;
    private List<PredictionResultUnit> results;

}
