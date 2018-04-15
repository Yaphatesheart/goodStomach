package com.kai.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.Order;
import com.kai.web.service.OrderService;

public class OrderUpdateSuccessController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.setViewName("manager/orderUpdate");
		Long id = Long.parseLong(request.getParameter("id"));
		String state = request.getParameter("state");
		OrderService orderService = new OrderService();
		Order order = orderService.findById(id);
		order.setState(state);
		orderService.updateOrder(order);
		return null;
	}

}
