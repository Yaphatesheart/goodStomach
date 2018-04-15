package com.kai.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.Kind;
import com.kai.web.service.KindService;

public class FoodAddController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		
		HttpSession session = request.getSession();
        KindService kindService = new KindService();
        List<Kind> kindList = kindService.selectAll();
        session.setAttribute("kindList", kindList);
		
		mv.setViewName("manager/foodAdd");
		return mv;
	}

}
