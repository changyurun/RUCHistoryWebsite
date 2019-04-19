package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.dao.GoodsDao;
import com.hand.ssm.dto.Goods;

@Controller
public class IntroductionController {
	@Autowired
	GoodsDao goodsDao;

	@RequestMapping("/Introduction")
	public String homePage(){
		return "guanyuhuaqi";
	}
	
}
