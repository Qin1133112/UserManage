package control;

import model.UserDao;
import pojo.User;

public class UserService {
	UserDao userDao=new UserDao();
	
	public boolean addUser(User u){
		
		return userDao.addUser(u);
	}
}
