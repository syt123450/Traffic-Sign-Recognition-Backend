package com.trafficsignrecognition.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/2.
 */

@Service
public class PathProperty {

    private static String UPLOAD_DIR;
    private static String MODEL_DIR;
    private static String ACCEPT_DIR;
    private static String REJECT_DIR;

    @Value("${upload.baseDir}")
    public void setUploadDir(String uploadDir) {
        UPLOAD_DIR = uploadDir;
    }

    @Value("${model.baseDir}")
    public void setModelDir(String modelDir) {
        MODEL_DIR = modelDir;
    }

    @Value("${accept.baseDir}")
    public void setAcceptDir(String acceptDir) {
        ACCEPT_DIR = acceptDir;
    }

    @Value("${reject.baseDir}")
    public void setRejectDir(String rejectDir) {
        REJECT_DIR = rejectDir;
    }

    public String getAcceptDir() {
        return ACCEPT_DIR;
    }

    public String getRejectDir() {
        return REJECT_DIR;
    }

    public String getModelDir() {
        return MODEL_DIR;
    }

    public String getUploadDir() {
        return UPLOAD_DIR;
    }
}
