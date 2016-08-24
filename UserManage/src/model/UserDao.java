package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pojo.User;
import utils.ConnUtil;
import utils.Max_Id;

public class UserDao {
	
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn;
	Max_Id mx=new Max_Id();
	/**
	 * 增加普通用户
	 * @param u
	 * @return flag
	 */
	
	public boolean addUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		try {
			int n = mx.select_maxUserId();
			String sql="insert into userInfo values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, n+1);
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getPwd());
			ps.setString(4, u.getEmail());
			ps.execute();
			conn.commit();
			flag=true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
