package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.ssm.dao.ColumnDao;
import com.hand.ssm.dao.PaperDao;
import com.hand.ssm.dto.Column;
import com.hand.ssm.dto.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.dao.GoodsDao;
import com.hand.ssm.dto.Goods;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsDao goodsDao;

	@Autowired
	ColumnDao columnDao;

	@Autowired
	PaperDao paperDao;

	@RequestMapping("/")
	public String homePage(){
		return "index";
	}
	
	@RequestMapping("/good")
	public String getGood(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		long id = Long.valueOf(request.getParameter("id"));
		
		Goods goods = goodsDao.getGoodByPrimaryKey(id);
		System.out.println(goods.getName());
		modelAndView.addObject("good", goods);

		Column column = columnDao.getColumnByPrimaryKey(id);
		System.out.println(column.getName());

		Paper paper = paperDao.getPaperByPrimaryKey(id);
		System.out.println(paper.getTitle());
		return "index";
	}

}
