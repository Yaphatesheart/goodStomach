package com.kai.web.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kai.bean.Food;
import com.kai.db.IFoodDao;

public class FoodService {
	ApplicationContext ac=
			new ClassPathXmlApplicationContext(
					"com/kai/db/mybatis/mybatis1.xml");
	IFoodDao fd = (IFoodDao) ac.getBean("foodDao");
	
	public void addOne(Food food){
		fd.addOne(food);
	}
	
	public void deleteOne(Long id){
		fd.deleteOne(id);
	}
	
	public void updateOne(Food food){
		fd.updateOne(food);
	}
	
	public List<Food> selectAll(){
		List<Food> list = fd.selectAll();
		return list;
	}
	
	public Food selectById(Long id){
		Food food = fd.selectById(id);
		return food;
	}
	
	public List<Food> selectByKind(Long k_id){
		List<Food> list = fd.selectByKind(k_id);
		return list;
	}
}
