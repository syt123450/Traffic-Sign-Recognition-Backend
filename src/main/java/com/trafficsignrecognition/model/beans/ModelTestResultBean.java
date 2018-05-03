package com.trafficsignrecognition.model.beans;

import lombok.Data;

import java.util.List;

/**
 * Created by ss on 2018/5/2.
 */

@Data
public class ModelTestResultBean {

    private double modelPrecise;
    private List<Double> classesPrecise;
}
