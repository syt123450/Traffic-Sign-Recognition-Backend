package com.trafficsignrecognition.model.service;

import com.trafficsignrecognition.model.beans.PredictionResponse;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ss on 2018/4/29.
 */
public interface PredictionHandler {

    PredictionResponse predict(MultipartFile file);
}
