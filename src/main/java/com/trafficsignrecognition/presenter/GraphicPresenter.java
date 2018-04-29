package com.trafficsignrecognition.presenter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ss on 2018/4/29.
 */

@RestController
@RequestMapping(value = "/v0")
public class GraphicPresenter {

    private static Logger logger = Logger.getLogger(GraphicPresenter.class);
    private Gson gson = new GsonBuilder().create();

    @RequestMapping(value = "/graphic", method = RequestMethod.GET)
    @ResponseBody
    public String getGraphicData() {
        return gson.toJson("");
    }
}
