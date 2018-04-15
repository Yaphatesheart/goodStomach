package com.kai.web.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kai.bean.User;
import com.kai.db.IUserDao;

public class UserService {
	ApplicationContext ac=
			new ClassPathXmlApplicationContext(
					"com/kai/db/mybatis/mybatis1.xml");

	IUserDao ud=(IUserDao) ac.getBean("userDao");
	
	public User selectByName(String name){
		User user = ud.selectUserByName(name);
		return user;
	}
	
	public void insertOne(User user){
		ud.insertOne(user);
	}
	
	public void deleteOne(Long id){
		ud.deleteById(id);
	}
	
	public List<User> selectAll(){
		List<User> list = ud.selectAll();
		return list;
	}
}
