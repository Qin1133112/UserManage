package utils;

import pojo.Role;
import pojo.User;

/**
 * 检查工具类
 * @author QinGuangrui
 *
 */
public class CheckUtils {
	
	/**
	 * 检查用户是否合法
	 * @param u
	 * @return flag
	 */
	public boolean checkUser(User u){
		boolean flag=false;
		if(u.getUserName() != null ){
			if(u.getPwd()!=null){
				if(u.getEmail()!=null){
					flag = checkEmail(u.getEmail());
				}else{
					System.out.println("邮箱为空，请重新输入！");
				}
			}else{
				System.out.println("密码为空！请重新输入！");
			}
		}else{
			System.out.println("用户名为空,请重新输入！");
			flag=false;
		}
		return flag;
	}

	/**
	 * 检查邮箱的合法性
	 * @param u
	 * @return flag
	 */
	public boolean checkEmail(String str) {
		boolean flag=true;
		if(str.indexOf('@')<0){
			System.out.println("不含@");
			flag=false;
		}
		else if(str.indexOf('.')<0){
			System.out.println("不含.");
			flag=false;
		}
		else if(str.indexOf('@')!=str.lastIndexOf('@')){
			System.out.println("含有多个@");
			flag=false;
		}
		else if(str.indexOf('.')!=str.lastIndexOf('.')){
			System.out.println("含有多个.");
			flag=false;
		}
		else if(str.indexOf('.')<str.indexOf('@')){
			System.out.println(".出现在@之前");
			flag=false;
		}
		return flag;
	}
	/**
	 * 检查用户角色
	 * 若为1则admin
	 * 若为2则user
	 * 否则重新输入
	 * @param role
	 * @return
	 */
	String r="";
	public String checkRole(Role role){
		if(role.getRoleName().equals("admin")){
			System.out.println("此用户将注册为管理员");
			r="1";
		}else if(role.getRoleName().equals("user")){
			System.out.println("此用户将注册为普通用户");
			r="2";
		}else{
			System.out.println("请选择管理员或普通用户注册信息");
			r="0";
		}
		return r;
	}
}
