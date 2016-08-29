package com.qin;

import java.util.Scanner;

public class J_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数字：");
		int n=sc.nextInt();
		if(n%3==0&&n%5==0){
			System.out.println("能同时被3和5整除");
		}
		else{
			System.out.println("不能同时被3和5整除");
		}
	}

}
