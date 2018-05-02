package com.trafficsignrecognition.model.beans;

import com.trafficsignrecognition.model.domain.ModelPreciseUnit;
import lombok.Data;

import java.util.List;

/**
 * Created by ss on 2018/5/2.
 */

@Data
public class LineDataBean {

    List<ModelPreciseUnit> averagePrecises;
}
