package com.qin.XT5;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("zhangsan");
		p1.setWeigth(33);
		p1.setHight(1.74f);
		p1.sayHello();
		Person p2=new Person();
		p2.setName("lisi");
		p2.setHight(1.74f);
		p2.setWeigth(44);
		p2.sayHello();
		System.out.println();
		
		
		System.out.println("通过构造函数传值：*******************************");
		Person p3=new Person("zhangsan",1.73f,55);
		p3.sayHello();
		Person p4=new Person("lisi",1.75f,50);
		p4.sayHello();
		

	}

}
