package com.trafficsignrecognition.model.dao;

import com.trafficsignrecognition.model.domain.ClassesPrecise;
import com.trafficsignrecognition.model.domain.ModelPreciseUnit;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by ss on 2018/5/2.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TrainingDaoTest {

    @Autowired
    private TrainingDao trainingDao;

    @Test
    @Ignore
    public void testAddNewModelPrecise() {
        ModelPreciseUnit modelPreciseUnit = new ModelPreciseUnit(0.7);
        trainingDao.addNewModelPrecise(modelPreciseUnit);
        System.out.println(modelPreciseUnit.getEpoch());
    }

    @Test
    @Ignore
    public void testAddNewClassesPrecise() {
        ClassesPrecise classesPrecise = new ClassesPrecise(
                2,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5,
                0.5
        );
        trainingDao.addNewClassesPrecise(classesPrecise);
    }

}