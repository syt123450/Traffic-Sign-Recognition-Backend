package com.trafficsignrecognition.presenter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trafficsignrecognition.model.beans.PredictionResponse;
import com.trafficsignrecognition.model.service.PredictionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.apache.log4j.Logger;

/**
 * Created by ss on 2018/3/30.
 */

@RestController
@RequestMapping(value = "/v0")
public class PredictionPresenter {

    private static Logger logger = Logger.getLogger(PredictionPresenter.class);
    private Gson gson = new GsonBuilder().create();
    @Autowired
    private PredictionHandler predictionHandler;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {

        PredictionResponse response = predictionHandler.predict(file);

        return gson.toJson(response);
    }
}