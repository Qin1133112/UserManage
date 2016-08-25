package dao;

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
	/**
	 * 根据用户ID查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserById(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo where userid=? ";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, u.getUserId());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 根据用户ID模糊查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByIds(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo where userid like '%?%'";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, u.getUserId());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("查询出错");
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 根据用户名查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByName(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo where userName=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 根据用户名模糊查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByNames(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo where userName like '%?%'";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 查询全部用户信息
	 * @param u
	 * @return 
	 */
	public boolean selectUserAll(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select userid,username,pwd,email from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("************************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public boolean updateByUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		int userId=u.getUserId();
		String sql="update userinfo set username=? and pwd=? and email=? where userid=userId";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.execute();
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

}
