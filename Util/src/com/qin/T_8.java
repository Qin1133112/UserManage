package com.qin;

import java.util.Scanner;

public class T_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个数字：");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		huiwen(n);
	}
	static void huiwen(int s){
		StringBuffer sb=new StringBuffer(s);
		StringBuffer s1=sb.reverse();
		if(sb.equals(s1)){
			System.out.println(s+"是回文数");
		}else{
			System.out.println(s+"不是回文数");
		}
	}
}
