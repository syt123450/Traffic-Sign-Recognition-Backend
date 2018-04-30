package com.trafficsignrecognition.model.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Data
public class PreciseMetrics {

    // precises for 43 classes
    List<Double> classesPrecise;

}
