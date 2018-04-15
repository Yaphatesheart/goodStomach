package com.kai.db;

import java.util.List;

import com.kai.bean.Order;

public interface IOrderDao {
	void addOrder(Order order);
	void deleteOrder(Long id);
	Order findById(Long id);
	List<Order> findAll();
	void updateOrder(Order order);
}
