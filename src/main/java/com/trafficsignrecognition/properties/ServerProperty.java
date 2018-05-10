package com.trafficsignrecognition.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ss on 2018/5/5.
 */

@Service
public class ServerProperty {

    private static String SERVER_ADDRESS;
    // it is not a good way to hard code port here, but getProperty("server.port") always get 0, do not know why
    private static String SERVER_PORT = "8080";

    public String getServerPort() {
        return SERVER_PORT;
    }

    @Value("${address.property}")
    public void setIp(String address) {
        SERVER_ADDRESS = address;
    }

    public String getServerAddress() {
        return SERVER_ADDRESS;
    }
}
