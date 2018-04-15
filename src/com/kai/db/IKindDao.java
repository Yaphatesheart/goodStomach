package com.kai.db;

import java.util.List;

import com.kai.bean.Kind;

public interface IKindDao {
	public List<Kind> selectAll();
	public Kind selectById(Long id);
	public void deleteOne(Long id);
	public void updateOne(Kind kind);
	public void addOne(Kind kind);
}
