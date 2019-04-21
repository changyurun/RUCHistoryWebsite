package com.hand.ssm.dao;

import com.hand.ssm.dto.Paper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaperDao {

	Paper getPaperByPrimaryKey(long id);
	
}
