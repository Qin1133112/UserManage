package com.qin.XT3;

public class Computer {
	private char corlor;
	private int cpu;
	public Computer(){
		System.out.println("我是无参数的构造方法");
	}
	public Computer(char corlor,int cpu){
		this.corlor=corlor;
		this.cpu=cpu;
		System.out.println("我是有参数的构造方法");
	}
	
	public void showInfomation(){
		System.out.println("该笔记本的颜色为："+corlor);
		System.out.println("该笔记本的cpu为："+cpu);
	}
}
