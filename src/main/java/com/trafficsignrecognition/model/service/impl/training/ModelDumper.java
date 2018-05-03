package com.trafficsignrecognition.model.service.impl.training;

import com.trafficsignrecognition.properties.PathProperty;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ss on 2018/5/2.
 */
public class ModelDumper {

    private static final String DUMP_SCRIPT_RAW = "mv %s %s";
    private static String DUMP_GRAPH_SCRIPT;
    private static String DUMP_LABEL_SCRIPT;

    @Autowired
    public void setDumpScript(PathProperty pathProperty) {
        DUMP_GRAPH_SCRIPT = String.format(DUMP_SCRIPT_RAW,
                pathProperty.getRetrainGraphDir(),
                pathProperty.getModelDir());
        DUMP_LABEL_SCRIPT = String.format(DUMP_SCRIPT_RAW,
                pathProperty.getRetrainLabelDir(),
                pathProperty.getModelDir());
    }

    public static void dump() {
        try {
            Process moveGraphProcess = Runtime.getRuntime().exec(DUMP_GRAPH_SCRIPT);
            moveGraphProcess.waitFor();
            Process moveLabelProcess = Runtime.getRuntime().exec(DUMP_LABEL_SCRIPT);
            moveLabelProcess.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
