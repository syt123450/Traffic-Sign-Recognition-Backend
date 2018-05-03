package com.trafficsignrecognition.model.service.impl.generator;

import com.trafficsignrecognition.model.domain.ModelPreciseUnit;

/**
 * Created by ss on 2018/5/2.
 */
public class ModelPreciseUnitGenerator {

    public static ModelPreciseUnit generate(double modelPrecise) {

        return new ModelPreciseUnit(modelPrecise);
    }

}
