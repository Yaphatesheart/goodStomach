package com.kai.db.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kai.bean.Line;
import com.kai.bean.Order;
import com.kai.bean.SomeMessage;
import com.kai.db.ILineDao;

public class LineDaoImpl implements ILineDao{

	private SqlSessionFactory sqlSessionFactory;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public List<Line> selectByU_id(SomeMessage someMessage) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Line> list = sqlSession.selectList("com.kai.db.ILineDao.selectByU_id", someMessage);
		return list;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("com.kai.db.ILineDao.deleteById",id);
	}

	@Override
	public void deleteByU_id(Long u_id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("com.kai.db.ILineDao.deleteByU_id", u_id);
	}

	@Override
	public void addLine(Line line) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("com.kai.db.ILineDao.addLine", line);
	}

	@Override
	public List<Line> selectU_id(Long u_id) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Line> list = sqlSession.selectList("com.kai.db.ILineDao.selectU_id", u_id);
		return list;
	}

}
