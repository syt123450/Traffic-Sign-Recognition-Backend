package com.trafficsignrecognition.presenter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trafficsignrecognition.model.handler.PredictionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by ss on 2018/3/30.
 */

@RestController
public class PredictionPresenter {

    private static Logger logger = Logger.getLogger(PredictionPresenter.class);
    private Gson gson = new GsonBuilder().create();
    @Autowired
    private PredictionHandler predictionHandler;

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {

        List<String> predictResult = predictionHandler.predict(file);

        return gson.toJson(predictResult);
    }
}