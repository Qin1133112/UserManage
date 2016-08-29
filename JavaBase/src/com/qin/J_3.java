package com.qin;

import java.util.Scanner;

public class J_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入十个数字：");
		max();
	}
	static void max(){
		Scanner sc =new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		//System.out.println(a.toString());
		System.out.println("最大值："+max);
	}

}
