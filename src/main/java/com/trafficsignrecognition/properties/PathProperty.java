package com.trafficsignrecognition.properties;

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
    private static String MODEL_PREDICT_SCRIPT_DIR;
    private static String MODEL_GRAPH_DIR;
    private static String MODEL_LABEL_DIR;
    private static String ACCEPT_DIR;
    private static String REJECT_DIR;
    private static String TEST_IMAGES_DIR;
    private static String RETRAIN_TEST_RESULT_DIR;
    private static String RETRAIN_GRAPH_DIR;
    private static String RETRAIN_LABEL_DIR;
    private static String RETRAIN_TRIGGER_TRAIN_DIR;
    private static String RETRAIN_TRIGGER_TEST_DIR;

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

    @Value("${dir.model.predictScript}")
    public void setModelPredictScriptDir(String modelPredictScriptDir) {
        MODEL_PREDICT_SCRIPT_DIR = modelPredictScriptDir;
    }

    @Value("${dir.model.graph}")
    public void setModelGraphDir(String modelGraphDir) {
        MODEL_GRAPH_DIR = modelGraphDir;
    }

    @Value("${dir.model.label}")
    public void setModelLabelDir(String modelLabelDir) {
        MODEL_LABEL_DIR = modelLabelDir;
    }

    @Value("${dir.data.accept}")
    public void setAcceptDir(String acceptDir) {
        ACCEPT_DIR = acceptDir;
    }

    @Value("${dir.data.reject}")
    public void setRejectDir(String rejectDir) {
        REJECT_DIR = rejectDir;
    }

    @Value("${dir.data.test}")
    public void setTestImagesDir(String testImagesDir) {
        TEST_IMAGES_DIR = testImagesDir;
    }

    @Value("${dir.retrain.testResult}")
    public void setRetrainTestResultDir(String retrainTestResultDir) {
        RETRAIN_TEST_RESULT_DIR = retrainTestResultDir;
    }

    @Value("${dir.retrain.graph}")
    public void setRetrainGraphDir(String retrainGraphDir) {
        RETRAIN_GRAPH_DIR = retrainGraphDir;
    }

    @Value("${dir.retrain.label}")
    public void setRetrainLabelDir(String retrainLabelDir) {
        RETRAIN_LABEL_DIR = retrainLabelDir;
    }

    @Value("${dir.retrain.trigger.train}")
    public void setRetrainTriggerTrainDir(String retrainTriggerTrainDir) {
        RETRAIN_TRIGGER_TRAIN_DIR = retrainTriggerTrainDir;
    }

    @Value("${dir.retrain.trigger.test}")
    public void setRetrainTriggerTestDir(String retrainTriggerTestDir) {
        RETRAIN_TRIGGER_TEST_DIR = retrainTriggerTestDir;
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

    public String getModelPredictScriptDir() {
        return MODEL_PREDICT_SCRIPT_DIR;
    }

    public String getModelGraphDir() {
        return MODEL_GRAPH_DIR;
    }

    public String getModelLabelDir() {
        return MODEL_LABEL_DIR;
    }

    public String getUploadDir() {
        return UPLOAD_DIR;
    }

    public String getRetrainTestResultDir() {
        return RETRAIN_TEST_RESULT_DIR;
    }

    public String getRetrainGraphDir() {
        return RETRAIN_GRAPH_DIR;
    }

    public String getRetrainLabelDir() {
        return RETRAIN_LABEL_DIR;
    }

    public String getTestImagesDir() {
        return TEST_IMAGES_DIR;
    }

    public String getRetrainTriggerTrainDir() {
        return RETRAIN_TRIGGER_TRAIN_DIR;
    }

    public String getRetrainTriggerTestDir() {
        return RETRAIN_TRIGGER_TEST_DIR;
    }

}
