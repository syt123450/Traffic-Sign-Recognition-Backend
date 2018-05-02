package com.trafficsignrecognition.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ss on 2018/5/2.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelPreciseUnit {

    private int epoch;
    private double precise;

    public ModelPreciseUnit(double precise) {
        this.precise = precise;
        this.epoch = 0;
    }

}
