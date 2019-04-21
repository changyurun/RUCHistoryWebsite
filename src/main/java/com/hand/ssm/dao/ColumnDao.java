package com.hand.ssm.dao;

import com.hand.ssm.dto.Column;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ColumnDao {
    Column getColumnByPrimaryKey(long id);
}
