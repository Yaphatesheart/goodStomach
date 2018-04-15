package com.kai.db.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kai.bean.Order;
import com.kai.db.IOrderDao;

public class OrderDaoImpl implements IOrderDao{
	
	private SqlSessionFactory sqlSessionFactory;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("com.kai.db.IOrderDao.addOrder", order);
	}

	@Override
	public void deleteOrder(Long id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("com.kai.db.IOrderDao.deleteOrder", id);
	}

	@Override
	public Order findById(Long id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Order order = sqlSession.selectOne("com.kai.db.IOrderDao.findById", id);
		return order;
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Order> list = sqlSession.selectList("com.kai.db.IOrderDao.findAll");
		return list;
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("com.kai.db.IOrderDao.updateOrder",order);
	}

}
