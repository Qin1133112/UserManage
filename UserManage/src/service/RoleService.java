package service;

import java.sql.SQLException;

import pojo.Role;
import dao.RoleDao;

public class RoleService {
	 RoleDao roleDao=new RoleDao();
	public RoleDao getRoleDao() {
		return roleDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}
	
	/**
	 * 将用户的角色插入到角色表中
	 * @param r
	 * @return
	 */
	public boolean addRole(Role r){
		return roleDao.addRole(r);
	}
	/**
	 * 删除用户角色
	 * @param id
	 * @throws SQLException
	 */
	public void deleteRole(int id) throws SQLException {
		roleDao.deleteRole(id);
	}
}
