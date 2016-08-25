package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import pojo.User;
import utils.CheckUtils;
import utils.ConnUtil;
import utils.Max_Id;


/**
 * 用户管理
 * @author QinGuangrui
 *
 */
public class UserDao {
	
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn;
	Scanner sc=new Scanner(System.in);
	Max_Id mx=new Max_Id();
	CheckUtils check=new CheckUtils();
	
	/**
	 * 用户查询个人信息
	 * @param u
	 * @return
	 */
	public boolean selectInfo(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String userName=u.getUserName();
		String sql="select userid,username,pwd,email from userinfo where userName=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("***********************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
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
	 * 管理员根据用户ID查询用户信息
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
	 * 管理员根据用户ID模糊查询用户信息
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
	 * 管理员根据用户名查询用户信息
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
	 * 管理员根据用户名模糊查询用户信息
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
	 * 管理员查询全部用户信息
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
	
	/**
	 * 普通用户更新自己的信息
	 * @param u
	 * @return
	 */
	public boolean updateByUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String user=u.getUserName();
		System.out.println(user);
		System.out.println("输入更改的用户名：");
		String userName=sc.next();
		System.out.println("输入新密码：");
		String pwd=sc.next();
		System.out.println("重新确认密码：");
		String pwd1=sc.next();
		
		String sql="update userinfo set username=?,pwd=?,email=? where username=user";
		if(pwd.equals(pwd1)){
			System.out.println("输入邮箱地址：");
			String email=sc.next();
			if(check.checkEmail(email)){
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setString(1, userName);
					ps.setString(2, pwd);
					ps.setString(3, email);
					ps.execute();
					conn.commit();
					System.out.println("修改成功");
					flag=true;
				} catch (SQLException e) {
					System.out.println("更新错误");
					e.printStackTrace();
				}
			}
			
		}else{
			System.out.println("两次密码输入不正确，请重新操作！");
		}
		return flag;
	}
	/**
	 * 管理员根据用户id对用户进行更改
	 * @param u
	 * @return
	 */
	public boolean updateById(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		System.out.println("输入要修改的用户ID：");
		int id=sc.nextInt();
		String sql="select userid from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getInt("userid")==id ){				//判断有没有用户
					System.out.println("输入更改的用户名：");
					String userName=sc.next();
					System.out.println("输入新密码：");
					String pwd=sc.next();
					System.out.println("重新确认密码：");
					String pwd1=sc.next();
					
					String sql1="update userinfo set username=?,pwd=?,email=? where userid=?";
					if(pwd.equals(pwd1)){
						System.out.println("输入邮箱地址：");
						String email=sc.next();
						if(check.checkEmail(email)){
							PreparedStatement ps1=conn.prepareStatement(sql1);
							ps1.setString(1, userName);
							ps1.setString(2, pwd);
							ps1.setString(3, email);
							ps1.setInt(4, id);
							ps1.execute();
							System.out.println("修改成功");
							String sql2="update pow set pow=? where userid=?";
							System.out.println("修改用户权限为1或2：");
							String pow=sc.next();
							PreparedStatement ps2=conn.prepareStatement(sql2);
							ps2.setString(1, pow);
							ps2.setInt(2, id);
							ps2.execute();
							conn.commit();
							flag=true;
						}
						
					}else{
						System.out.println("两次密码输入不正确，请重新操作！");
					}
				}else{
					System.out.println("没有此用户");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

}
