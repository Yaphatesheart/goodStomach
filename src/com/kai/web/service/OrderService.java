package com.kai.web.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kai.bean.Order;
import com.kai.db.IOrderDao;

public class OrderService {
	ApplicationContext ac=
			new ClassPathXmlApplicationContext(
					"com/kai/db/mybatis/mybatis1.xml");
	IOrderDao od = (IOrderDao) ac.getBean("orderDao");
	
	public void addOrder(Order order){
		od.addOrder(order);
	}
	
	public void deleteOrder(Long id){
		od.deleteOrder(id);
	}
	
	public Order findById(Long id){
		Order order = od.findById(id);
		return order;
	}
	
	public List<Order> findAll(){
		List<Order> list = od.findAll();
		return list;
	}
	
	public void updateOrder(Order order){
		od.updateOrder(order);
	}
}
