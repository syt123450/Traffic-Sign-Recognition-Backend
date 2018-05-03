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

    private static final String PREDICT_TEMPLATE = "python %s/model/label_image.py" +
            " --graph=%s/model/output_graph.pb" +
            " --labels=%s/model/output_labels.txt" +
            " --input_layer=Mul" +
            " --output_layer=final_result" +
            " --input_mean=128" +
            " --input_std=128" +
            " --image=%s";
    @Autowired
    private PathProperty pathProperty;

    public List<String> call(String imagePath) {

        String modelBaseDir = pathProperty.getModelDir();
        List<String> predictResult = new ArrayList<>();

        try {
            String predictScript = String.format(PREDICT_TEMPLATE,
                    modelBaseDir,
                    modelBaseDir,
                    modelBaseDir,
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
