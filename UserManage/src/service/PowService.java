package service;

import java.sql.SQLException;

import pojo.Power;
import dao.PowerDao;

public class PowService {
	
	
	PowerDao powDao=new PowerDao();

	/**
	 * 增加用户权限
	 * @param u
	 * @return flag
	 */
	
	public boolean addPow(Power p){
		return powDao.addPow(p);
	}
	/**
	 * 删除用户权限
	 * @param id
	 * @throws SQLException
	 */
	public void deletePow(int id) throws SQLException {
		powDao.deletePow(id);
	}
	/**
	 * 根据用户id更新用户权限
	 * @param id
	 * @throws SQLException
	 */
	public void updatePow(int id) throws SQLException {
		powDao.updatePow(id);
	}
}
