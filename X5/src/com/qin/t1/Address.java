package com.qin.t1;

public class Address {
	private String country;
	private String provice;
	private String city;
	private String stress;
	private String postNo;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvice() {
		return provice;
	}
	public void setProvice(String provice) {
		this.provice = provice;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStress() {
		return stress;
	}
	public void setStress(String stress) {
		this.stress = stress;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public Address(){
		
	}
	public Address(String country, String provice, String city, String stress,
			String postNo) {
		super();
		this.country = country;
		this.provice = provice;
		this.city = city;
		this.stress = stress;
		this.postNo = postNo;
	}
	public void showInfo(){
		System.out.println("地址的信息为："+this.country+this.provice+this.city+this.stress+this.postNo);
	}
}
