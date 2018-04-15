package com.kai.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.Kind;
import com.kai.web.service.KindService;

public class KindAddSuccessController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		String name = request.getParameter("name");
		String message = request.getParameter("message");
		Kind kind = new Kind(null, name, message);
		
		KindService kindService = new KindService();
		kindService.addOne(kind);
		
		mv.setViewName("manager/kindAdd");
		return null;
	}

}
