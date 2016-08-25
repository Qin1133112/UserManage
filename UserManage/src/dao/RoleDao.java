package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pojo.Role;
import utils.ConnUtil;
import utils.Max_Id;

/**
 * 角色管理
 * @author QinGuangrui
 *
 */
public class RoleDao {
	
	private Role role;
	
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn;
	Max_Id mx=new Max_Id();

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	/**
	 * 新增用户角色
	 * @param r
	 * @return
	 */
	public boolean addRole(Role r){
		boolean flag=false;
		conn=connUtil.getConn();
		if(r.getRoleName()!=null){
			String sql="insert into u_role(rid,rolename,userid) values(?,?,?)";
			try {
				int n=mx.select_maxRoleId();
				int i=mx.select_maxUserId();
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, n+1);
				ps.setString(2, r.getRoleName());
				ps.setInt(3, i);
				ps.execute();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			flag=true;
		}
		return flag;
	}
	
	
	
	
	
	
}
