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

/**
 * 用户注册类
 * @author QinGuangrui
 *
 */

public class RegisteAction {
	
	Scanner sc=new Scanner(System.in);
	ConnUtil connUtil=new ConnUtil();
	Connection conn=connUtil.getConn();
	/**
	 * 管理员对用户信息注册
	 */
	public void register() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		/**
		 * 注册用户名、密码、邮箱
		 */
		System.out.println("输入用户名：");
		String userName=sc.next();
		String sql="select username from userinfo";
		boolean b=true;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){												//判断用户名是否存在
				if(rs.getString("username").equals(userName)){
					b=false;
				}
			}
			//对用户名存在与否进行相关操作
			if(!b){
				System.out.println("用户名以存在，请重新注册！");
				register();
			}else{
				System.out.println("输入密码：");
				String pwd=sc.next();
				System.out.println("输入确认密码：");
				String pwd1=sc.next();
				//密码必须一致
				if(pwd.equals(pwd1)){
					System.out.println("输入邮箱地址：");
					String email=sc.next();
					u.setUserName(userName);
					u.setPwd(pwd);
					u.setEmail(email);
					//对用户名、密码是否为空和邮箱格式是否正确进行判断，并进行相关操作
					if(check.checkUser(u)){
						UserService us=new UserService();
						us.addUser(u);
						//System.out.println("用户添加完成");
						// 注册用户角色
						String i = register_role(check);
						//根据用户据说修改权限表
						registe_Power(i);
					}else{
						register();
					}
					
				}else{
					System.out.println("两次密码不一致,请重新注册");
					register();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * 普通用户信息注册
	 */
	public void userRegister() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		/**
		 * 注册用户名、密码、邮箱
		 */
		System.out.println("输入用户名：");
		String userName=sc.next();
		String sql="select username from userinfo";
		boolean b=true;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){												//判断用户名是否存在
				if(rs.getString("username").equals(userName)){
					b=false;
				}
			}
			//对用户名存在与否进行相关操作
			if(!b){
				System.out.println("用户名以存在，请重新注册！");
				register();
			}else{
				System.out.println("输入密码：");
				String pwd=sc.next();
				System.out.println("输入确认密码：");
				String pwd1=sc.next();
				//密码必须一致
				if(pwd.equals(pwd1)){
					System.out.println("输入邮箱地址：");
					String email=sc.next();
					u.setUserName(userName);
					u.setPwd(pwd);
					u.setEmail(email);
					//对用户名、密码是否为空和邮箱格式是否正确进行判断，并进行相关操作
					if(check.checkUser(u)){
						UserService us=new UserService();
						us.addUser(u);
						//System.out.println("用户添加完成");
						// 注册用户角色
						String i = userRegister_role(check);
						//根据用户据说修改权限表
						registe_Power(i);
					}else{
						userRegister();
					}
					
				}else{
					System.out.println("两次密码不一致，请重新注册");
					userRegister();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * 根据用户角色修改权限表
	 * @param i
	 */
	public void registe_Power(String i) {
		Power p=new Power();
		p.setPow(i);
		PowService ps=new PowService();
		ps.addPow(p);
		//System.out.println("插入权限成功");
	}

	/**
	 * 管理员注册用户角色
	 * @param check
	 * @return 角色权限值 i
	 */
	public String register_role(CheckUtils check) {
		Role r=new Role();
		System.out.println("请输入用户的角色:admin 或者 user：");
		String role=sc.next();
		String i="";
		if(role.equals("admin") || role.equals("user")){
			r.setRoleName(role);
			i=check.checkRole(r);
			RoleService rs=new RoleService();
			rs.addRole(r);
			//System.out.println("角色插入完成");
		}else{
			System.out.println("输入角色不正确，请重新注册！");
			register_role(check);
		}
		
		return i;
	}
	/**
	 *  不经过管理员注册用户角色 默认为角色为user
	 * @param check
	 * @return 角色权限值 i
	 */
	public String userRegister_role(CheckUtils check) {
		Role r=new Role();
		String i="";
		String role="user";
			r.setRoleName(role);
			i=check.checkRole(r);
			RoleService rs=new RoleService();
			rs.addRole(r);
			//System.out.println("角色插入完成");	
		return i;
	}
	
}
