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
