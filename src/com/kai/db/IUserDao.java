package com.kai.db;

import java.util.List;

import com.kai.bean.User;

public interface IUserDao {
	public User selectUserByName(String name);
	public void insertOne(User user);
	public List<User> selectAll();
	public void deleteById(Long id);
}
