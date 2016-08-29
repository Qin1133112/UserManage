package com.qin.KH.service;

import com.qin.KH.dao.UserDao;

public class UserService {
	UserDao user;
	String sql="create table user("
			+ "Name varchar(10) primary key"
			+ "Pwd varchar(6) not null"
			+ "Email varchar(64)"
			+ "Birthday DATE";
	public void createTable(){
		user.createTable(sql);
	}
}
