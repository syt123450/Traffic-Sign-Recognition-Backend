package com.trafficsignrecognition.model.dao;

import com.trafficsignrecognition.model.domain.RecordUnit;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ss on 2018/4/29.
 */

@Repository
public interface RecordDao {

    List<RecordUnit> getHistoryRecords();

    void insertRecord(@Param("classname") int classname,
                      @Param("accuracy") double accuracy,
                      @Param("accept") boolean accept,
                      @Param("imageURL") String imageURL,
                      @Param("time") String time);

}
