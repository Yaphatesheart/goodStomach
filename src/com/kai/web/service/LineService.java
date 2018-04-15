package com.kai.web.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kai.bean.Line;
import com.kai.bean.Order;
import com.kai.bean.SomeMessage;
import com.kai.db.ILineDao;

public class LineService {
	ApplicationContext ac=
			new ClassPathXmlApplicationContext(
					"com/kai/db/mybatis/mybatis1.xml");
	ILineDao ld = (ILineDao) ac.getBean("lineDao");
	
	public List<Line> selectByU_id(SomeMessage someMessage){
		List<Line> list = ld.selectByU_id(someMessage);
		return list;
	}
	
	public void deleteById(Long id){
		ld.deleteById(id);
	}
	
	public void deleteByU_id(Long u_id){
		ld.deleteByU_id(u_id);
	}
	
	public void addLine(Line line){
		ld.addLine(line);
	}
	
	public List<Line> selectU_id(Long u_id){
		List<Line> list = ld.selectU_id(u_id);
		return list;
	}
}
