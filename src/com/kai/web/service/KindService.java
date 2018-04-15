package com.kai.web.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kai.bean.Kind;
import com.kai.db.IKindDao;

public class KindService {
	ApplicationContext ac=
			new ClassPathXmlApplicationContext(
					"com/kai/db/mybatis/mybatis1.xml");
	IKindDao kd = (IKindDao) ac.getBean("kindDao");
	
	public void addOne(Kind kind){
		kd.addOne(kind);
	}
	
	public void deleteOne(Long id){
		kd.deleteOne(id);
	}
	
	public List<Kind> selectAll(){
		List<Kind> kindList = kd.selectAll();
		return kindList;
	}
	
	public Kind selectById(Long id){
		Kind kind = kd.selectById(id);
		return kind;
	}
	
	public void updateOne(Kind kind){
		kd.updateOne(kind);
	}
	
}
