package com.trafficsignrecognition.presenter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trafficsignrecognition.model.beans.HighChartDataBean;
import com.trafficsignrecognition.model.service.GraphicHandler;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ss on 2018/4/29.
 */

@CrossOrigin
@RestController
@RequestMapping(value = "/v0")
public class GraphicPresenter {

    private static Logger logger = Logger.getLogger(GraphicPresenter.class);
    private Gson gson = new GsonBuilder().create();

    @Autowired
    private GraphicHandler graphicHandler;

    @RequestMapping(value = "/graphic", method = RequestMethod.GET)
    @ResponseBody
    public String getGraphicData() {

        HighChartDataBean highChartDataBean = graphicHandler.getData();

        return gson.toJson(highChartDataBean);
    }
}
