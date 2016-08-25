package service;

import dao.UserDao;
import pojo.User;

public class UserService {
	UserDao userDao=new UserDao();
	
	public boolean addUser(User u){
		
		return userDao.addUser(u);
	}
}
