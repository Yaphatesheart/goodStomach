package com.kai.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.Food;
import com.kai.bean.PageBean;
import com.kai.web.service.FoodService;

public class FoodManagerController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		FoodService foodService = new FoodService();
		List<Food> foodsList = foodService.selectAll();
		HttpSession session = request.getSession();
		
		String pageId = request.getParameter("id");
		int curPage = 0;
		if(pageId==null){
			curPage = 1;
		}else{
			curPage = Integer.parseInt(pageId);
		}
		System.out.println("curPage value is:"+curPage);
		PageBean pageBean = new PageBean(foodsList.size());//初始化PageBean对象  
		//设置当前页  
		pageBean.setCurPage(curPage);
		//这里page是从页面上获取的一个参数，代表页数  
		//获得分页大小  
		int pageSize = pageBean.getPageSize();
		//获得分页数据在list集合中的索引 
		int firstIndex = (curPage-1)*pageSize;
		int toIndex = curPage*pageSize;
		if(toIndex>foodsList.size()){
			toIndex = foodsList.size();
		}
		if(firstIndex>toIndex){
			firstIndex = 0;
			pageBean.setCurPage(1);
		}
		//截取数据集合，获得分页数据
		List<Food> foodList = foodsList.subList(firstIndex, toIndex);
		
		session.setAttribute("foodList", foodList);
		session.setAttribute("pageBean", pageBean);
		mv.setViewName("manager/foodManager");
		return mv;
	}
	
	

}
