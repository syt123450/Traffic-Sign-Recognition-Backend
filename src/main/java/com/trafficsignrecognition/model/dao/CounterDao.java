package com.trafficsignrecognition.model.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by ss on 2018/5/2.
 */

@Repository
public interface CounterDao {

    int getCounter();

    void clearCounter();

    void addCounter();
}
