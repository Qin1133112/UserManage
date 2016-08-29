package com.qin.t7;

public class Test {

	public static void main(String[] args) {
		System.out.println("*************************************************************");
		Employee e1=new Employee();
		e1.showInfomation();
		System.out.println("*************************************************************");
		Employee e2=new Employee("1122");
		e2.showInfomation();
		System.out.println("*************************************************************");
		Employee e3=new Employee("4455","刘备");
		e3.showInfomation();
		System.out.println("*************************************************************");
		Employee e4=new Employee("7788","张飞",10000,"经理部");
		e4.showInfomation();
	}

}
