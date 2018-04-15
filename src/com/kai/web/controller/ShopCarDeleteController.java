package com.kai.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.ShoppingCar;

public class ShopCarDeleteController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Long id = Long.parseLong(request.getParameter("id"));
		ShoppingCar shoppingCar = (ShoppingCar) session.getAttribute("shoppingCar");
		shoppingCar.delete(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("shopCar");
		return mv;
	}

}
