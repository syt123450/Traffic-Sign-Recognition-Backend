package com.trafficsignrecognition.model.utils;

/**
 * Created by ss on 2018/4/29.
 */
public class PathUtils {

    public static String generateFrontendImagePath(String fileName, String port) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("localhost:")
                .append(port)
                .append("/")
                .append(fileName);

        return stringBuilder.toString();
    }

}
