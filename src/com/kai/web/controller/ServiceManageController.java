package com.kai.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServiceManageController implements Controller{
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //判断是否登录 如果登录 则直接跳转页面
        ModelAndView mv = new ModelAndView();
        mv.setViewName("manager/serviceManage");
        return mv;
    }
}
