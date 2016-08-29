package com.qin.kh_5;

import java.util.Scanner;

public class Gardener {
	public Fruit create(){
		Fruit f=null;
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		
			if(c.equals("苹果")){
				f=new Apple();
				//flag=false;
			}
			else if(c.equals("香蕉")){
				f=new Banana();
			}
			else if(c.equals("橘子")){
				f=new Oranges();
			}
			else if(c.equals("葡萄")){
				f=new Pear();
			}else{
				System.out.println("输入的对象不存在");
			}
		return f;
	}
}
