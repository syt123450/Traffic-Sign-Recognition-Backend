package com.trafficsignrecognition.model.beans;

import com.trafficsignrecognition.model.domain.ClassesPrecise;
import lombok.Data;

import java.util.List;

/**
 * Created by ss on 2018/5/2.
 */

@Data
public class ComboDataBean {

    private List<ClassesPrecise> classesPrecises;
    private List<Double> averages;

}
