package com.trafficsignrecognition.model.domain;

import lombok.Data;

/**
 * Created by ss on 2018/4/29.
 */

@Data
public class RecordUnit {

    private int classname;
    private double accuracy;
    private boolean accept;
    private String imageURL;
    private String time;

}
