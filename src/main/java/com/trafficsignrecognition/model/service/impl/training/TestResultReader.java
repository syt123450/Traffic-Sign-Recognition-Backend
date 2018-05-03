package com.trafficsignrecognition.model.service.impl.training;

import com.trafficsignrecognition.model.beans.ModelTestResultBean;
import com.trafficsignrecognition.properties.PathProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/5/2.
 */

@Component
public class TestResultReader {

    @Autowired
    private PathProperty pathProperty;

    public ModelTestResultBean read() {

        ModelTestResultBean result = new ModelTestResultBean();

        try {
            File resultFile = new File(pathProperty.getRetrainTestResultDir());
            FileInputStream inputStream = new FileInputStream(resultFile);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            String strLine;
            strLine = br.readLine();
            result.setModelPrecise(Double.parseDouble(strLine));

            List<Double> classesPrecise = new ArrayList<>();

            while ((strLine = br.readLine()) != null) {
                classesPrecise.add(Double.parseDouble(strLine));
            }

            result.setClassesPrecise(classesPrecise);

            resultFile.delete();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }

}
