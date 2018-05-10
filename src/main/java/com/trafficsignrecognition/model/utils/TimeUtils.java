package com.trafficsignrecognition.model.utils;

import java.util.Calendar;

/**
 * Created by ss on 2018/4/28.
 */
public class TimeUtils {

    public static String getTimeNowInString() {

        Calendar calendar = Calendar.getInstance();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(calendar.get(Calendar.YEAR))
                .append("-")
                .append(calendar.get(Calendar.MONTH) + 1)
                .append("-")
                .append(calendar.get(Calendar.DAY_OF_MONTH))
                .append("T")
                .append(calendar.get(Calendar.HOUR_OF_DAY))
                .append(":")
                .append(calendar.get(Calendar.MINUTE))
                .append(":")
                .append(calendar.get(Calendar.SECOND))
                .append("Z");

        return stringBuilder.toString();
    }

}
