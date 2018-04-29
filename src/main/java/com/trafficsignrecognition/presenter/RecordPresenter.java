package com.trafficsignrecognition.presenter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trafficsignrecognition.model.beans.HistoryRecordBean;
import com.trafficsignrecognition.model.beans.PredictionResponse;
import com.trafficsignrecognition.model.service.handler.PredictionHandler;
import com.trafficsignrecognition.model.service.handler.RecordHandler;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ss on 2018/4/29.
 */

@RestController
public class RecordPresenter {

    private static Logger logger = Logger.getLogger(PredictionPresenter.class);
    private Gson gson = new GsonBuilder().create();
    @Autowired
    private RecordHandler recordHandler;

    @RequestMapping(value = "/record", method = RequestMethod.GET)
    @ResponseBody
    public String getHistory() {

        HistoryRecordBean historyRecordBean = recordHandler.getHistoryRecords();

        return gson.toJson(historyRecordBean);
    }
}
