package control;

import model.RoleDao;
import pojo.Role;

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
}
