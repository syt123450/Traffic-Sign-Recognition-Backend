package com.trafficsignrecognition.model.dao;

import com.trafficsignrecognition.model.domain.ClassesPrecise;
import com.trafficsignrecognition.model.domain.ModelPreciseUnit;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Repository
public interface GraphicDao {

    List<ModelPreciseUnit> getModelPrecises();
    List<ClassesPrecise> getClassPrecises();
}
