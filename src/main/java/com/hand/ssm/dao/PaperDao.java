package com.hand.ssm.dao;

import com.hand.ssm.dto.Paper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaperDao {

	Paper getPaperByPrimaryKey(long id);

	List<Paper> getPaperByPage(@Param("pageNum") int pageNum,@Param("pageSize") int pageSize);
	
}
