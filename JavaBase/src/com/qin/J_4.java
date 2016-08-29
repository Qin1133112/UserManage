package com.qin;

import java.util.Scanner;

public class J_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("输入一个分数：");
		int n=sc.nextInt();
		int i=n/10;
		if(n<100&&n>=0){
			switch(i){
			case 10:
			case  9:
					System.out.println("等级A");
					break;
			case  8:
				System.out.println("等级B");
				break;
			case  7:
				System.out.println("等级C");
				break;
			case  6:
				System.out.println("等级D");
				break;
			default :
				System.out.println("等级E");
					
			}
		}else{
			System.out.println("输入了错误的分数");
		}
		
	}

}
