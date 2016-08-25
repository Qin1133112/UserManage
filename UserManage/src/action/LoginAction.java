package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.User;
import utils.ConnUtil;

/**
 * 用户登录类
 * @author QinGuangrui
 *
 */

public class LoginAction {
	Scanner sc=new Scanner(System.in);
	ConnUtil connUtil=new ConnUtil();
	Connection conn=connUtil.getConn();
	/**
	 * 用户登录
	 * @param u
	 * @return 用户id号
	 */
	public int login(User u){
		int userId=0;
		System.out.println("输入用户名：");
		String userName=sc.next();
		u.setUserName(userName);
		System.out.println("输入密码：");
		String pwd=sc.next();
		u.setPwd(pwd);
		String sql="select userid,username,pwd from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getString("username").equals(u.getUserName()) && rs.getString("pwd").equals(u.getPwd())){
					userId=rs.getInt("userid");
					//System.out.println("验证通过");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userId;
	}
	
}
