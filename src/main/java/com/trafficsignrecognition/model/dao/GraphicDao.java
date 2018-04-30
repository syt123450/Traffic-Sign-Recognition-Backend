package com.trafficsignrecognition.model.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Repository
public interface GraphicDao {

    List<Double> getModelPrecises();
}
