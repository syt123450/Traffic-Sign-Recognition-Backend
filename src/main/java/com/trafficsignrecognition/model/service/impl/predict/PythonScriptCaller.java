package com.trafficsignrecognition.model.service.impl.predict;

import com.trafficsignrecognition.properties.PathProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ss on 2018/3/30.
 */

@Service
public class PythonScriptCaller {

    private static final String PREDICT_RAW = "python %s" +
            " --graph=%s" +
            " --labels=%s" +
            " --input_layer=Mul" +
            " --output_layer=final_result" +
            " --input_mean=128" +
            " --input_std=128" +
            " --image=%s";
    private static String PREDICT_TEMPLATE;

    @Autowired
    public void setPredictTemplate(PathProperty pathProperty) {
        PREDICT_TEMPLATE = String.format(PREDICT_RAW,
                pathProperty.getModelPredictScriptDir(),
                pathProperty.getModelGraphDir(),
                pathProperty.getModelLabelDir(),
                "%s");
    }

    public List<String> call(String imagePath) {

        List<String> predictResult = new ArrayList<>();

        try {
            String predictScript = String.format(PREDICT_TEMPLATE,
                    imagePath);

            Process ps = Runtime.getRuntime().exec(predictScript);
            ps.waitFor();

            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
            String line;

            while ((line = br.readLine()) != null) {
                predictResult.add(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return predictResult;
    }
}
