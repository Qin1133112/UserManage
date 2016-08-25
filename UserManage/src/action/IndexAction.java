package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.User;
import service.UserService;
import utils.ConnUtil;
import action.RegisteAction;

/**
 * 进行页面布局和逻辑设计
 * @author QinGuangrui
 *
 */

public class IndexAction {
	static Scanner sc=new Scanner(System.in);
	static RegisteAction action=new RegisteAction();
	static LoginAction login=new LoginAction();
	static SelectAction select=new SelectAction();
	static User u=new User();
	static UserService us=new UserService();
	public static ConnUtil connUtil=new ConnUtil();
	public static Connection conn;
/**
 * 欢迎页面
 */
	public void index() {
		conn=connUtil.getConn();
		System.out.println("=======欢迎使用用户管理系统=======");
		System.out.println("请输入数字选择以下功能：");
		System.out.println("1:用户登录");
		System.out.println("2.退出系统");
		System.out.println("***********************************");
		int i=sc.nextInt();
		int userId=0;
		switch(i){
			case 1: userId=login.login(u);
				break;
			case 2: System.exit(0);
				break;
		}
		afterLogin(userId);
	}
/**
 * 登录成功之后进行角色判断
 * @param userId
 */
	public  void afterLogin(int userId) {
		String role="";
		if(userId!=0){
			System.out.println("登录成功");
			String sql="select rolename from u_role where userid=?";
			try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, userId);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					role=rs.getString("rolename");
					System.out.println("你是"+role);
					break;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			loginIndex(role);
		}else{
			index();
		}
	}
/**
 * 角色判断后进行相关操作
 * @param role
 */
	public  void loginIndex(String role) {
		boolean flag=true;
		while(flag){
			System.out.println("请选择以下功能");
			if(role.equals("admin")){
				System.out.println("1.查询用户信息");
				System.out.println("2.修改用户信息");
				System.out.println("3.删除用户信息");
				System.out.println("4.注册新用户");
				System.out.println("5.退出当前登录");
				System.out.println("**********************");
				int a=sc.nextInt();
				switch(a){
				case 1:
					selectIndex(role);
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					action.register();
					break;
				case 5:index();
					flag=false;
					break;
				}
			}else if(role.equals("user")){
				System.out.println("1.查询用户信息");
				System.out.println("2.修改用户信息");
				System.out.println("3.退出当前登录");
				System.out.println("**********************");
				int a=sc.nextInt();
				switch(a){
				case 1:
					us.selectInfo(u);
					break;
				case 2:
					us.updateByUser(u);
					break;
				case 3:index();
					flag=false;
					break;
				}
			}else{
				System.out.println("无此角色");
			}
		}
		
	}
/**
 * 管理员的 查询操作
 */
	public  void selectIndex(String role) {
		boolean flag=true;
		while(flag){
			System.out.println("1.查询全部用户信息");
			System.out.println("2.根据用户ID查询用户信息");
			System.out.println("3.根据用户ID模糊查询用户信息");
			System.out.println("4.根据用户名查询用户信息");
			System.out.println("5.根据用户名模糊查询用户信息");
			System.out.println("6.退出查询");
			System.out.println("**********************************");
			int b=sc.nextInt();
			switch(b){
			case 1: 
				select.selectAll();
				break;
			case 2:
				select.selectById();
				break;
			case 3:
				select.selectByIds();
				break;
			case 4:
				select.selectByUserName();
				break;
			case 5:
				select.selectByUserNames();
				break;
			case 6:
				loginIndex(role);
				flag=false;
				break;
			}
		}
		
	}

	
}
