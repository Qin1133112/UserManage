package com.qin.KH.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qin.KH.util.ConnUtil;

/**
 * UserDao类
 * 数据库增删改查的方法
 * @author Admin
 *
 */

public class UserDao {
	
	
	Connection conn=ConnUtil.getInstance();
	Statement st=null;
	ResultSet rs;
	
	/**
	 * 创建数据库表
	 * @param sql
	 */
	public void createTable(String sql){
		
		
		try {
			st=conn.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("建表失败");
			e.printStackTrace();
		}
		
	}
	/**
	 * 插入数据库
	 * @param sql
	 */
	public void inser(String sql){
		try {
			st=conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 更新数据库
	 * @param sql
	 */
	public void update(String sql){
		try {
			st=conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * 删除数据库
	 * @param sql
	 */
	public void delete(String sql){
		try {
			st=conn.createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库删除失败");
			e.printStackTrace();
		}
		
	}
	
	
	
}
