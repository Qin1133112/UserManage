package com.qin;

import java.util.Scanner;

public class J_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	static void fun(){
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(n<7){
			System.out.println("输入数字：");
			int c=sc.nextInt();
			switch(c){
			case 1:
				System.out.println("星期日");
				break;
			case 2:
				System.out.println("星期一");
				break;
			case 3:
				System.out.println("星期二");
				break;
			case 4:
				System.out.println("星期三");
				break;
			case 5:
				System.out.println("星期四");
				break;
			case 6:
				System.out.println("星期五");
				break;
			case 7:
				System.out.println("星期六");
				break;
			}
			n++;
		}
	}
}
