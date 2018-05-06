package com.trafficsignrecognition.model.service.impl.training;

import com.trafficsignrecognition.model.dao.TrainingDao;
import com.trafficsignrecognition.model.service.impl.generator.ClassAverageGenerator;
import com.trafficsignrecognition.model.service.impl.generator.ClassesPreciseGenerator;
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
public class TestResultReaderTest {

    @Autowired
    private TestResultReader testResultReader;

    @Autowired
    private TrainingDao trainingDao;

    @Test
    @Ignore
    public void testRead() {
//        System.out.println(testResultReader.read());
        trainingDao.addNewClassesPrecise(ClassesPreciseGenerator.generate(
                6,
                testResultReader.read().getClassesPrecise()));
    }
}