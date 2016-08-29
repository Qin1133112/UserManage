package com.qin.XT3;

public class Test {

	public static void main(String[] args) {
		System.out.println("第1台笔记本电脑的信息");
		Computer c1=new Computer();
		c1.showInfomation();
		System.out.println("第2台笔记本电脑的信息");
		Computer c2=new Computer('r',1234);
		c2.showInfomation();
		

	}

}
