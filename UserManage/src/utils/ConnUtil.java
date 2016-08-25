package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 数据库连接工具类
 *@author QinGuangrui
 *
 */

public class ConnUtil {
	
	/**
	 * 封装数据库连接
	 * @return conn
	 */
	private static Connection conn(){
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:qin";
			String user="scott";
			String password="tiger";
			conn=DriverManager.getConnection(url,user,password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("连接错误");
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 获取数据库连接对象
	 * @return conn
	 */
	public Connection getConn(){
		Connection conn=ConnUtil.conn();
		return conn;
	}
}
