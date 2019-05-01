package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.ssm.dao.ColumnDao;
import com.hand.ssm.dto.Paper;
import com.hand.ssm.service.GoodsService;
import com.hand.ssm.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.dao.GoodsDao;

import java.util.List;

@Controller
public class IndexController {

	@Autowired
	private PaperService paperService;

	@RequestMapping("/")
	public ModelAndView homePage(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		try {
			List<Paper> paperList = paperService.getIndexPaperList();
			modelAndView.addObject("paperList", paperList);
			System.out.println("获取长度列表："+paperList.size());
			modelAndView.setViewName("index");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}

}
