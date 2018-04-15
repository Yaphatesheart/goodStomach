package com.kai.db.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kai.bean.Food;
import com.kai.db.IFoodDao;

public class FoodDaoImpl implements IFoodDao{
	
	private SqlSessionFactory sqlSessionFactory;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public void addOne(Food food) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("com.kai.db.IFoodDao.addOne", food);
	}

	@Override
	public void deleteOne(Long id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("com.kai.db.IFoodDao.deleteOne", id);
	}

	@Override
	public void updateOne(Food food) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("com.kai.db.IFoodDao.updateOne", food);
	}

	@Override
	public List<Food> selectAll() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Food> list = sqlSession.selectList("com.kai.db.IFoodDao.selectAll");
		return list;
	}

	@Override
	public Food selectById(Long id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Food food= sqlSession.selectOne("com.kai.db.IFoodDao.selectById", id);
		return food;
	}

	@Override
	public List<Food> selectByKind(Long k_id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Food> list = sqlSession.selectList("com.kai.db.IFoodDao.selectByKind", k_id);
		return list;
	}

}
