package main;

import pojo.User;
import service.UserService;
import action.IndexAction;

/**
 * 主类，程序入口
 * @author QinGuangrui
 *
 */

public class UserManageSystem {
	public static void main(String[] args) {	
			IndexAction action=new IndexAction();
			action.index();
//			User u=new User();
//			UserService us=new UserService();
//			us.selectUserByIds(u);
	}
}