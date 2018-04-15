package com.kai.db.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kai.bean.User;
import com.kai.db.IUserDao;

public class UserDaoImpl implements IUserDao{

	private SqlSessionFactory sqlSessionFactory;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public User selectUserByName(String name) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user = sqlSession.selectOne("com.kai.db.IUserDao.selectUserByName", name);
		System.out.println(user);
		return user;
	}

	@Override
	public void insertOne(User user) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("com.kai.db.IUserDao.insertOne", user);
		System.out.println(user);
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> list = sqlSession.selectList("com.kai.db.IUserDao.selectAll");
		return list;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("com.kai.db.IUserDao.deleteById", id);
		
	}


}
