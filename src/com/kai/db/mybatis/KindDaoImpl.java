package com.kai.db.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kai.bean.Kind;
import com.kai.db.IKindDao;

public class KindDaoImpl implements IKindDao{

	private SqlSessionFactory sqlSessionFactory;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public List<Kind> selectAll() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Kind> list = sqlSession.selectList("com.kai.db.IKindDao.selectAll");
		return list;
	}

	@Override
	public Kind selectById(Long id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Kind kind = sqlSession.selectOne("com.kai.db.IKindDao.selectById", id);
		return kind;
	}

	@Override
	public void deleteOne(Long id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("com.kai.db.IKindDao.deleteOne",id);
	}

	@Override
	public void updateOne(Kind kind) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.update("com.kai.db.IKindDao.updateOne", kind);
	}

	@Override
	public void addOne(Kind kind) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("com.kai.db.IKindDao.addOne", kind);
	}

}
