package com.qin.KH.pojo;

import java.sql.Date;


public class User {
	private String Name;
	private String Pwd;
	private String Email;
	private Date Birthdate;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	
}
