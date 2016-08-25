package service;

import dao.UserDao;
import pojo.User;

public class UserService {
	UserDao userDao=new UserDao();
	
	/**
	 * 增加用户
	 * @param u
	 * @return
	 */
	
	public boolean addUser(User u){
		
		return userDao.addUser(u);
	}
	/**
	 * 根据用户ID查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserById(User u){
		return userDao.selectUserById(u);
	}
	/**
	 * 根据用户ID模糊查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserId(User u){
		return userDao.selectUserByIds(u);
	}
	/**
	 * 根据用户名查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByName(User u){
		return userDao.selectUserByName(u);
	}
	/**
	 * 根据用户名模糊查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByNames(User u){
		return userDao.selectUserByNames(u);
	}
	/**
	 * 查询全部用户信息
	 * @param u
	 * @return 
	 */
	public boolean selectUserAll(User u){
		return userDao.selectUserAll(u);
	}
}
