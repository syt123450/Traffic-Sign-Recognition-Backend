package com.trafficsignrecognition.model.service.impl;

import com.trafficsignrecognition.model.beans.ModelTestResultBean;
import com.trafficsignrecognition.model.dao.CounterDao;
import com.trafficsignrecognition.model.dao.TrainingDao;
import com.trafficsignrecognition.model.domain.ClassesPrecise;
import com.trafficsignrecognition.model.domain.ModelPreciseUnit;
import com.trafficsignrecognition.model.service.TrainingHandler;
import com.trafficsignrecognition.model.service.impl.generator.ClassesPreciseGenerator;
import com.trafficsignrecognition.model.service.impl.generator.ModelPreciseUnitGenerator;
import com.trafficsignrecognition.model.service.impl.training.ModelDumper;
import com.trafficsignrecognition.model.service.impl.training.TestResultReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/2.
 */

@Service
@Profile("dev")
public class TrainingHandlerImpl implements TrainingHandler {

    @Autowired
    private CounterDao counterDao;
    @Autowired
    private TestResultReader testResultReader;
    @Autowired
    private TrainingDao trainingDao;

    public void train() {
        // retrain model

        // test model

        // read model test result from text file
        ModelTestResultBean modelTestResultBean = testResultReader.read();

        // insert new model metrics into database

        ModelPreciseUnit modelPreciseUnit = ModelPreciseUnitGenerator.generate(modelTestResultBean.getModelPrecise());
        trainingDao.addNewModelPrecise(modelPreciseUnit);

        ClassesPrecise classesPrecise = ClassesPreciseGenerator.generate(
                modelPreciseUnit.getEpoch(),
                modelTestResultBean.getClassesPrecise());
        trainingDao.addNewClassesPrecise(classesPrecise);

        // move model
        ModelDumper.dump();

        // update counter
        counterDao.clearCounter();
    }
}
