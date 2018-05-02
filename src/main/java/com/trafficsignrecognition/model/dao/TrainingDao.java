package com.trafficsignrecognition.model.dao;

import com.trafficsignrecognition.model.domain.ClassesPrecise;
import com.trafficsignrecognition.model.domain.ModelPreciseUnit;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by ss on 2018/5/2.
 */

@Repository
public interface TrainingDao {

    void addNewModelPrecise(@Param("modelPreciseUnit") ModelPreciseUnit modelPreciseUnit);

    void addNewClassesPrecise(@Param("classesPrecise")ClassesPrecise classesPrecise);
}
