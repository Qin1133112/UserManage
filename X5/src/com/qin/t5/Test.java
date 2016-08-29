package com.qin.t5;

public class Test {

	public static void main(String[] args) {
		System.out.println("实例化第1个对象：");
		User u1=new User();
		u1.show();
		System.out.println("实例化第2个对象：");
		User u2=new User("张飞");
		u2.show();
		System.out.println("实例化第3个对象：");
		User u3=new User("关羽","11111");
		u3.show();

	}

}
