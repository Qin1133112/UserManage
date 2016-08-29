package com.qin.t5;

public class User {
	private String userName;
	private String password;
	private int count=0;//记录用户个数
	public User(){
		
	}
	public User(String userName){
		this.userName=userName;
	}
	public User(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(){
		this.password=password;
	}
	
	public void show(){
		
			count++;
		System.out.println("用户名："+userName);
		System.out.println("密码："+password);
		System.out.println("用户个数"+count+"个");
	}
}
