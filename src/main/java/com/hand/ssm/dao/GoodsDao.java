package com.hand.ssm.dao;

import com.hand.ssm.dto.Goods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsDao {

	Goods getGoodByPrimaryKey(long goodId);
	
}
