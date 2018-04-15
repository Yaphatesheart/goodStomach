package com.kai.db;

import java.util.List;

import com.kai.bean.Line;
import com.kai.bean.SomeMessage;

public interface ILineDao {
	List<Line> selectByU_id(SomeMessage someMessage);
	void deleteById(Long id);
	void deleteByU_id(Long u_id);
	void addLine(Line line);
	List<Line> selectU_id(Long u_id);
}
