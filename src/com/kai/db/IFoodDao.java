package com.kai.db;

import java.util.List;

import com.kai.bean.Food;

public interface IFoodDao {
	public void addOne(Food food);
	public void deleteOne(Long id);
	public void updateOne(Food food);
	public List<Food> selectAll();
	public Food selectById(Long id);
	public List<Food> selectByKind(Long k_id);
}
