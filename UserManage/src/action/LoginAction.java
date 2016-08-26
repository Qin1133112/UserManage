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
	RegisteAction ra=new RegisteAction();
	IndexAction ia=new IndexAction();
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
		String sql="select userid,username,pwd from userinfo where username=? and pwd=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, pwd);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				userId=rs.getInt("userid");
		}else{
			System.out.println("改用户不存在!请先注册或者退出！");
			System.out.println("1.注册");
			System.out.println("2.返回上一级");
			String n=sc.next();
			switch(n){
				case "1":
					ra.register();
					break;
				case "2":
					ia.index();
					break;
				default:
					System.exit(0);
					break;
			}
			
		}
		} catch (SQLException e) {
			//login(u);
			//e.printStackTrace();
		}
		return userId;
	}
	
}
