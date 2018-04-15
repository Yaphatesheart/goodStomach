package com.kai.web.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kai.bean.Manager;
import com.kai.db.IManagerDao;

public class ManagerService {
	ApplicationContext ac=
			new ClassPathXmlApplicationContext(
					"com/kai/db/mybatis/mybatis1.xml");

	IManagerDao md=(IManagerDao) ac.getBean("managerDao");
	
	public Manager selectManagerByName(String name){
		Manager manager = md.selectManagerByName(name);
		return manager;
	}
}
