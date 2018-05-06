package com.trafficsignrecognition.model.service.impl.training;

import com.trafficsignrecognition.properties.PathProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ss on 2018/5/2.
 */

@Component
public class ModelTestingCaller {

    private static final String TEST_COMMAND_RAW = "python %s" +
            " --graph=%s" +
            " --labels=%s" +
            " --input_layer=Mul" +
            " --output_layer=final_result" +
            " --input_mean=128 --input_std=128" +
            " --test_out_path=%s" +
            " --file_dir=%s";

    private static String TEST_COMMAND;

    @Autowired
    public void setTestCommand(PathProperty pathProperty) {
        TEST_COMMAND = String.format(TEST_COMMAND_RAW, pathProperty.getRetrainTriggerTestDir(),
                pathProperty.getRetrainGraphDir(),
                pathProperty.getRetrainLabelDir(),
                pathProperty.getRetrainTestResultDir(),
                pathProperty.getTestImagesDir());
    }

    public void test() {
        try {
            Process ps = Runtime.getRuntime().exec(TEST_COMMAND);
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
