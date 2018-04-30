package com.trafficsignrecognition.model.service.mock;

import com.trafficsignrecognition.model.service.GraphicHandler;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/4/29.
 */

@Service
@Profile("mock")
public class MockGraphicHandler implements GraphicHandler {
    @Override
    public void getData() {

    }
}
