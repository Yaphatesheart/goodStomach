package com.kai.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.Kind;
import com.kai.bean.User;
import com.kai.web.service.KindService;
import com.kai.web.service.UserService;

public class LoginController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession(); 
		UserService userService = new UserService();
		KindService kindService = new KindService();
		try {
			
			User user = userService.selectByName(username);
			List<Kind> kindList = kindService.selectAll();
			if(user==null){
				System.out.println("该用户不存在");
				mv.setViewName("index");
			}else{
				if(user.getPassword().equals(password)==false){
					System.out.println("密码错误");
					mv.setViewName("index");	
				}
				session.setAttribute("user", user);
				session.setAttribute("kindList", kindList);

				mv.setViewName("home");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mv;
	}
	
}
