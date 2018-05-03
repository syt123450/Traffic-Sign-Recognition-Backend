package com.trafficsignrecognition.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/2.
 */

@Service
public class PathProperty {

    private static String BASE_DIR;
    private static String UPLOAD_DIR;
    private static String MODEL_DIR;
    private static String ACCEPT_DIR;
    private static String REJECT_DIR;
    private static String RETRAIN_TEST_RESULT_DIR;

    @Value("${dir.base}")
    public void setBaseDir(String baseDir) {
        BASE_DIR = baseDir;
    }

    @Value("${dir.upload}")
    public void setUploadDir(String uploadDir) {
        UPLOAD_DIR = uploadDir;
    }

    @Value("${dir.model}")
    public void setModelDir(String modelDir) {
        MODEL_DIR = modelDir;
    }

    @Value("${dir.data.accept}")
    public void setAcceptDir(String acceptDir) {
        ACCEPT_DIR = acceptDir;
    }

    @Value("${dir.data.reject}")
    public void setRejectDir(String rejectDir) {
        REJECT_DIR = rejectDir;
    }

    @Value("${dir.retrain.testResult}")
    public void setRetrainTestResultDir(String retrainTestResultDir) {
        RETRAIN_TEST_RESULT_DIR = retrainTestResultDir;
    }

    public String getBaseDir() {
        return BASE_DIR;
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

    public String getRetrainTestResultDir() {
        return RETRAIN_TEST_RESULT_DIR;
    }

}
