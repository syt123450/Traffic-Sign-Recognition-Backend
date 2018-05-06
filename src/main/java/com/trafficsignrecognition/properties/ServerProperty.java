package com.trafficsignrecognition.properties;

import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/5.
 */

@Service
public class ServerProperty {

    // it is not a good way to hard code port here, but getProperty("server.port") always get 0, do not know why
    private static String SERVER_PORT = "8080";

    public String getServerPort() {
        return SERVER_PORT;
    }
}
