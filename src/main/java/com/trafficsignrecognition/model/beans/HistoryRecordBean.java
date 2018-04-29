package com.trafficsignrecognition.model.beans;

import com.trafficsignrecognition.model.domain.RecordUnit;
import lombok.Data;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Data
public class HistoryRecordBean {

    private String errorMessage;
    private List<RecordUnit> records;
}
