package com.trafficsignrecognition.model.service.impl.training;

import com.trafficsignrecognition.properties.PathProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * Created by ss on 2018/5/2.
 */

@Component
public class ModelTrainingCaller {

    private static final String TRAINING_COMMAND_RAW = "python %s" +
            " --image_dir %s" +
            " --output_graph %s" +
            " --intermediate_output_graphs_dir %s" +
            " --output_labels %s" +
            " --model_dir %s" +
            " --summaries_dir %s" +
            " --bottleneck_dir %s" +
            " --saved_model_dir %s/%s";
    private static String TRAINING_COMMAND_TEMPLATE;

    @Autowired
    public void setTrainingCommand(PathProperty pathProperty) {
        TRAINING_COMMAND_TEMPLATE = String.format(TRAINING_COMMAND_RAW, pathProperty.getRetrainTriggerTrainDir(),
                pathProperty.getAcceptDir(),
                pathProperty.getRetrainGraphDir(),
                pathProperty.getInterGraphDir(),
                pathProperty.getRetrainLabelDir(),
                pathProperty.getInterModelDir(),
                pathProperty.getInterSummaryDir(),
                pathProperty.getInterBottleneckDir(),
                pathProperty.getInterSavedModelDir(),
                "$s");
    }

    public void train() {

        String trainingCommand = String.format(TRAINING_COMMAND_TEMPLATE,
                Calendar.getInstance().getTimeInMillis());

        try {
            Process ps = Runtime.getRuntime().exec(trainingCommand);
            ps.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
