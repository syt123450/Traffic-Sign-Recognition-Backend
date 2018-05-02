package com.trafficsignrecognition.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ss on 2018/5/2.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassesPrecise {

    private int epoch;
    private double class0;
    private double class1;
    private double class2;
    private double class3;
    private double class4;
    private double class5;
    private double class6;
    private double class7;
    private double class8;
    private double class9;
    private double class10;
    private double class11;
    private double class12;
    private double class13;
    private double class14;
    private double class15;
    private double class16;
    private double class17;
    private double class18;
    private double class19;
    private double class20;
    private double class21;
    private double class22;
    private double class23;
    private double class24;
    private double class25;
    private double class26;
    private double class27;
    private double class28;
    private double class29;
    private double class30;
    private double class31;
    private double class32;
    private double class33;
    private double class34;
    private double class35;
    private double class36;
    private double class37;
    private double class38;
    private double class39;
    private double class40;
    private double class41;
    private double class42;

    @Override
    public Object clone() {
        ClassesPrecise classesPrecise = null;
        try{
            classesPrecise = (ClassesPrecise)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return classesPrecise;
    }
}
