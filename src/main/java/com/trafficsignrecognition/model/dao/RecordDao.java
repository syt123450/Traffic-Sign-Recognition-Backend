package com.trafficsignrecognition.model.dao;

import com.trafficsignrecognition.model.domain.RecordUnit;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Repository
public interface RecordDao {

    List<RecordUnit> getHistoryRecords();

}
