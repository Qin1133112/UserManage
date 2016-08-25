package service;

import dao.UserDao;
import pojo.User;

public class UserService {
	UserDao userDao=new UserDao();
	
	
	/**
	 * 用户查询个人信息
	 * @param u
	 * @return
	 */
	public boolean selectInfo(User u){
		return userDao.selectInfo(u);
	}
	
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
	public boolean selectUserByIds(User u){
		return userDao.selectUserByIds(u);
	}
	/**
	 * 根据用户名查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByName(User u){
		System.out.println("us"+u.getUserName());
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
	/**
	 * 普通用户更新自己的信息
	 * @param u
	 * @return
	 */
	public boolean updateByUser(User u){
		return userDao.updateByUser(u);
	}
	
	/**
	 * 管理员根据用户id对用户进行更改
	 * @param u
	 * @return
	 */
	public boolean updateById(User u){
		return userDao.updateById(u);
	}
	/**
	 * 管理员通过用户ID号删除用户的信息
	 * @param u
	 * @return
	 */
	public boolean deleteById(User u){
		return userDao.deleteById(u);
	}
}
