package com.trafficsignrecognition.presenter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trafficsignrecognition.model.beans.HistoryRecordBean;
import com.trafficsignrecognition.model.service.RecordHandler;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ss on 2018/4/29.
 */

@RestController
@RequestMapping(value = "/v0")
public class RecordPresenter {

    private static Logger logger = Logger.getLogger(RecordPresenter.class);
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
