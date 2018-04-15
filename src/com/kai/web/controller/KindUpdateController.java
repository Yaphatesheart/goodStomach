package com.kai.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.Kind;
import com.kai.web.service.KindService;

public class KindUpdateController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		
		long id = (Long.parseLong(request.getParameter("id")));		
		KindService kindService = new KindService();
		Kind kind = kindService.selectById(id);
		
		session.setAttribute("kind",kind);
		mv.setViewName("manager/kindUpdate");
		return mv;
	}

}
