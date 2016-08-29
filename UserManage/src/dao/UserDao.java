package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.User;
import service.PowService;
import service.RoleService;
import utils.CheckUtils;
import utils.ConnUtil;
import utils.Max_Id;


/**
 * 用户管理
 * @author QinGuangrui
 *
 */
public class UserDao {
	
	public ConnUtil connUtil=new ConnUtil();
	public Connection conn;
	Scanner sc=new Scanner(System.in);
	Max_Id mx=new Max_Id();
	CheckUtils check=new CheckUtils();
	PowService pows=new PowService();
	RoleService rs=new RoleService();
	
	/**
	 * 用户查询个人信息
	 * @param u
	 * @return
	 */
	public boolean selectInfo(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String userName=u.getUserName();
		String sql="select userid,username,pwd,email from userinfo where userName=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, userName);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("***********************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 增加用户
	 * @param u
	 * @return flag
	 */
	
	public boolean addUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		try {
			int n = mx.select_maxUserId();
			String sql="insert into userInfo values(?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, n+1);
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getPwd());
			ps.setString(4, u.getEmail());
			ps.execute();
			conn.commit();
			flag=true;	
		} catch (SQLException e) {
			System.out.println("注册失败");
			//e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 管理员根据用户ID查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserById(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
						+ "from userinfo u,pow p,u_role r "
						+ "where u.userid=p.userid and p.userid=r.userid and u.userid = ? ";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, u.getUserId());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("用户权限值："+rs.getString("pow"));
				System.out.println("用户角色："+rs.getString("rolename"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 管理员根据用户ID模糊查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByIds(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		
		int id=u.getUserId();
		String userId="%"+id+"%";
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
						+ "from userinfo u,pow p,u_role r "
						+ "where u.userid=p.userid and p.userid=r.userid and u.userid like ? ";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,userId);
			ps.execute();
			ResultSet rs=ps.getResultSet();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("用户权限值："+rs.getString("pow"));
				System.out.println("用户角色："+rs.getString("rolename"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("查询出错，请重新选择操作！");
			//e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 管理员根据用户名查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByName(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
						+ "from userinfo u ,pow p,u_role r "
						+ "where u.userid=p.userid and p.userid=r.userid and userName like ?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, u.getUserName());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("用户权限值："+rs.getString("pow"));
				System.out.println("用户角色："+rs.getString("rolename"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("查询出错，请重新选择操作！");
			//e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 管理员根据用户名模糊查询用户信息
	 * @param u
	 * @return
	 */
	public boolean selectUserByNames(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
						+ "from userinfo u ,pow p,u_role r "
						+ "where u.userid=p.userid and p.userid=r.userid and userName like ?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, "%"+u.getUserName()+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("用户权限值："+rs.getString("pow"));
				System.out.println("用户角色："+rs.getString("rolename"));
				System.out.println("************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("查询出错，请重新选择操作！");
			//e.printStackTrace();
		}
		return flag;
	}
	/**
	 * 管理员查询全部用户信息
	 * @param u
	 * @return 
	 */
	public boolean selectUserAll(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String sql="select u.userid userid,username,pwd,email,pow,rolename "
				+ "from userinfo u,pow p,u_role r "
				+ "where u.userid=p.userid and p.userid=r.userid";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				System.out.println("用户id:"+rs.getInt("userid"));
				System.out.println("用户名:"+rs.getString("username"));
				System.out.println("用户密码:"+rs.getString("pwd"));
				System.out.println("用户邮箱:"+rs.getString("email"));
				System.out.println("用户权限值："+rs.getString("pow"));
				System.out.println("用户角色："+rs.getString("rolename"));
				System.out.println("************************************");
			}
			conn.commit();
			flag=true;
		} catch (SQLException e) {
			System.out.println("查询出错，请重新选择操作！");
			//e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 普通用户更新自己的信息
	 * @param u
	 * @return
	 */
	public boolean updateByUser(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		String user=u.getUserName();
		System.out.println(user);
		System.out.println("输入更改的用户名：");
		String userName=sc.next();
		System.out.println("输入新密码：");
		String pwd=sc.next();
		System.out.println("重新确认密码：");
		String pwd1=sc.next();
		
		String sql="update userinfo set username=?,pwd=?,email=? where username = ?";
		if(pwd.equals(pwd1)){
			System.out.println("输入邮箱地址：");
			String email=sc.next();
			if(check.checkEmail(email)){
				try {
					PreparedStatement ps=conn.prepareStatement(sql);
					ps.setString(1, userName);
					ps.setString(2, pwd);
					ps.setString(3, email);
					ps.setString(4, user);
					ps.execute();
					conn.commit();
					System.out.println("修改成功");
					u.setUserName(userName);
					flag=true;
				} catch (SQLException e) {
					System.out.println("更新错误");
					e.printStackTrace();
				}
			}
			
		}else{
			System.out.println("两次密码输入不正确，请重新操作！");
		}
		return flag;
	}
	/**
	 * 管理员根据用户id对用户进行更改
	 * @param u
	 * @return
	 */
	public boolean updateById(User u){
		boolean flag=false;
		conn=connUtil.getConn();
		System.out.println("输入要修改的用户ID：");
		int id=sc.nextInt();
		String sql="select userid from userinfo";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				if(rs.getInt("userid")==id ){				//判断有没有用户
					System.out.println("输入更改的用户名：");
					String userName=sc.next();
					System.out.println("输入新密码：");
					String pwd=sc.next();
					System.out.println("重新确认密码：");
					String pwd1=sc.next();
					
					String sql1="update userinfo set username=?,pwd=?,email=? where userid= ?";
					if(pwd.equals(pwd1)){
						System.out.println("输入邮箱地址：");
						String email=sc.next();
						if(check.checkEmail(email)){
							PreparedStatement ps1=conn.prepareStatement(sql1);
							ps1.setString(1, userName);
							ps1.setString(2, pwd);
							ps1.setString(3, email);
							ps1.setInt(4, id);
							ps1.execute();
							System.out.println("修改成功");
							pows.updatePow(id);																//根据输入的id更新权限
							conn.commit();
							flag=true;
						}
						
					}else{
						System.out.println("两次密码输入不正确，请重新操作！");
					}
				}
			}
		} catch (SQLException e) {
			System.out.println("更新失败，请重新操作！");
			try {
				conn.rollback();
				updateById(u);
			} catch (SQLException e1) {

				//e1.printStackTrace();
			}
			//e.printStackTrace();
		}
		return flag;
	}
	
	/**
	 * 管理员通过用户ID号删除用户的信息
	 * @param u
	 * @return
	 */
	public boolean deleteById(User u){
		boolean flag=false;
		boolean b=true;																		//判断是否进入循环
		conn=connUtil.getConn();
		while(b){
			System.out.println("输入要删除的用户ID号：");
			int id=sc.nextInt();
			if(id==u.getUserId()){
				System.out.println("当前用户无法删除，请重新输入ID!");
			}else{
				String sql1="select userid from userinfo where userid = ?";
				try {
					PreparedStatement ps1=conn.prepareStatement(sql1);
					ps1.setInt(1, id);
					ps1.execute();
					ResultSet rs1=ps1.getResultSet();
					if(rs1.next()){
						String sql="delete from userinfo where userid = ?";
						try {
							PreparedStatement ps=conn.prepareStatement(sql);
							ps.setInt(1,id);
							ps.executeUpdate();
							pows.deletePow(id);													//根据userid删除用户权限					
							rs.deleteRole(id);													//根据userid删除用户角色
							conn.commit();
							System.out.println("删除用户" + id + "成功");
							System.out.println("继续删除请输入1，否则任意键返回上一级");
							String a=sc.next();
							if(!a.equals("1")){
								b=false;
								
							}
							flag=true;
						} catch (SQLException e) {
							System.out.println("删除过程出错,请重新操作！");
							try {
								conn.rollback();
								deleteById(u);
							} catch (SQLException e1) {
								//e1.printStackTrace();
							}
						}
					}else{
						System.out.println("用户不存在，请重新操作！");
						deleteById(u);
					}
					
				} catch (SQLException e2) {
					System.out.println("输入有误！");
					deleteById(u);
				}
	
			}
		}		
		return flag;
	}
}
