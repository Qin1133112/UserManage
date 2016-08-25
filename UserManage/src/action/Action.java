package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.Power;
import pojo.Role;
import pojo.User;
import service.PowService;
import service.RoleService;
import service.UserService;
import utils.CheckUtils;
import utils.ConnUtil;

public class Action {
	
	Scanner sc=new Scanner(System.in);
	ConnUtil connUtil=new ConnUtil();
	Connection conn=connUtil.getConn();
	/**
	 * 用户登录
	 */
	public boolean login(User u){
		boolean flag=false;
		System.out.println("输入用户名：");
		String userName=sc.next();
		u.setUserName(userName);
		System.out.println("输入密码：");
		String pwd=sc.next();
		u.setPwd(pwd);
		String sql="select username,pwd from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getString("username").equals(u.getUserName()) && rs.getString("pwd").equals(u.getPwd())){
					flag=true;
					//System.out.println("验证通过");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 用户信息注册
	 */
	public void register() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		
			
		System.out.println("输入用户名：");
		String userName=sc.next();
		System.out.println("输入密码：");
		String pwd=sc.next();
		System.out.println("输入邮箱地址：");
		String email=sc.next();
		u.setUserName(userName);
		u.setPwd(pwd);
		u.setEmail(email);
		check.checkUser(u);
		UserService us=new UserService();
		us.addUser(u);
		System.out.println("用户添加完成");

		Role r=new Role();
		System.out.println("请输入用户的角色:admin 或者 user：");
		String role=sc.next();
		r.setRoleName(role);
		String i=check.checkRole(r);
		RoleService rs=new RoleService();
		rs.addRole(r);
		System.out.println("角色插入完成");
		
		Power p=new Power();
		p.setPow(i);
		PowService ps=new PowService();
		ps.addPow(p);
		System.out.println("插入权限成功");
	}
	/**
	 * 抽出selectId（）方法，减少代码量
	 */
	public void selectId() {
		User u=new User();
		int userid=sc.nextInt();
		u.setUserId(userid);
		UserService us=new UserService();
		us.selectUserById(u);
	}
	/**
	 * 通过ID号查询
	 */
	public void selectById(){
		System.out.println("输入用户id号：");
		selectId();
	}
	
	/**
	 * 通过ID号模糊查询
	 */
	public void selectByIds(){
		System.out.println("输入id相关字段：");
		selectId();
	}
	/**
	 * 抽出selectName（）方法，减少代码量
	 */
	public void selectName() {
		User u=new User();
		String userName=sc.next();
		u.setUserName(userName);
		UserService us=new UserService();
		us.selectUserById(u);
	}
	/**
	 * 通过用户名查询
	 */
	public void selectByUserName(){
		System.out.println("输入用户名：");
		selectName();
	}
	
	/**
	 * 通过用户名模糊查询
	 */
	public void selectByUserNames(){
		System.out.println("输入用户名相关字段：");
		selectName();
	}
	/**
	 * 查询用户的所有信息
	 */
	public void selectAll(){
		User u=new User();
		UserService us=new UserService();
		us.selectUserAll(u);
	}

}
