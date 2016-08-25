package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import pojo.Power;
import utils.ConnUtil;
import utils.Max_Id;

/**
 * 权限管理
 * @author QinGuangrui
 *
 */

public class PowerDao {
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn;
	Max_Id mx=new Max_Id();
	
	/**
	 * 增加用户权限
	 * @param u
	 * @return flag
	 */
	
	public boolean addPow(Power p){
		boolean flag=false;
		conn=connUtil.getConn();
			String sql="insert into pow values(?,?,?)";
			try {
				int n=mx.select_maxPowId();
				int i=mx.select_maxUserId();
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, n+1);
				ps.setString(3, p.getPow());
				ps.setInt(2, i);
				ps.execute();
				flag=true;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		return flag;
	}
}
