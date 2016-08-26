package action;

import java.util.Scanner;

import pojo.User;
import service.UserService;

/**
 * 查询类
 * @author QinGuangrui
 *
 */

public class SelectAction {
	Scanner sc=new Scanner(System.in);
	User u=new User();
	UserService us=new UserService();
	/**
	 * 通过ID号查询
	 */
	public void selectById(){
		System.out.println("输入用户id号：");
		int userid=sc.nextInt();
		u.setUserId(userid);
		us.selectUserById(u);
	}
	
	/**
	 * 通过ID号模糊查询
	 */
	public void selectByIds(){
		System.out.println("输入id相关字段：");
		int userid=sc.nextInt();
		u.setUserId(userid);
		us.selectUserByIds(u);
	}
	
	/**
	 * 通过用户名查询
	 */
	public void selectByUserName(){
		System.out.println("输入用户名：");
		String userName=sc.next();
		u.setUserName(userName);
		us.selectUserByName(u);
	}
	
	/**
	 * 通过用户名模糊查询
	 */
	public void selectByUserNames(){
		System.out.println("输入用户名相关字段：");
		String userName=sc.next();
		u.setUserName(userName);
		us.selectUserByNames(u);
	}
	/**
	 * 查询用户的所有信息
	 */
	public void selectAll(){
		us.selectUserAll(u);
	}

}
