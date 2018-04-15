package com.kai.db.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kai.bean.Manager;
import com.kai.db.IManagerDao;

public class ManagerDaoImpl implements IManagerDao{

private SqlSessionFactory sqlSessionFactory;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public Manager selectManagerByName(String name) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Manager manager  = sqlSession.selectOne("com.kai.db.IManagerDao.selectManagerByName", name);
		System.out.println(manager);
		return manager;
	}
}
