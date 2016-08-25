package action;

import java.util.Scanner;

import pojo.Power;
import pojo.Role;
import pojo.User;
import service.PowService;
import service.RoleService;
import service.UserService;
import utils.CheckUtils;

public class Action {
	/**
	 * 用户信息注册
	 */
	public void register() {
		
		User u=new User();
		CheckUtils check=new CheckUtils();
		Scanner sc=new Scanner(System.in);
			
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

}
