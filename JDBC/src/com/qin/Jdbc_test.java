package com.qin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.qin.util.Conn;

public class Jdbc_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=Conn.getInstance();;
		String sql="select * from dept";
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			System.out.println("部门号   	部门名称    		部门地址");
			while(rs.next()){
				//System.out.print(rs.getRow()+" ");
				System.out.print(rs.getObject("deptno")+"  	");
				System.out.print(rs.getObject("dname")+"  	");
				System.out.print(rs.getObject("loc")+"  		");
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println();
		System.out.println("连接成功");
	}

}
