package com.trafficsignrecognition.model.service.impl;

import com.trafficsignrecognition.model.dao.GraphicDao;
import com.trafficsignrecognition.model.service.GraphicHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("dev")
public class GraphicHandlerImpl implements GraphicHandler {

    @Autowired
    private GraphicDao graphicDao;

    public void getData() {

    }
}
