package com.kai.db;

import com.kai.bean.Manager;

public interface IManagerDao {
	public Manager selectManagerByName(String name);
}
