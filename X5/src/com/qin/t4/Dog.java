package com.qin.t4;

public class Dog {
	private String name;
	private String corlor;
	private int age;
	public Dog(){}
	public Dog(String name,String corlor,int age){
		this.name=name;
		this.corlor=corlor;
		this.age=age;
	}
	public void showInfo(){
		System.out.println("狗的名字："+this.name);
		System.out.println("狗的颜色："+this.corlor);
		System.out.println("狗的年龄："+this.age+"岁");
	}
}
