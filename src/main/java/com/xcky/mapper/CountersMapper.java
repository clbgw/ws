package com.xcky.mapper;

import com.xcky.model.Counter;
import org.apache.ibatis.annotations.Param;

public interface CountersMapper {

    Counter getCounter(@Param("id") Integer id);

    void upsertCount(Counter counter);

    void clearCount(@Param("id") Integer id);
}
