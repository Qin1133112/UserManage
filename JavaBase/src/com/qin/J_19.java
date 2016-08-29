package com.qin;

import java.util.Scanner;

public class J_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sub("中国ja方法akakka kjakjka", 8);
	}
	static void sub(String s,int j){
		int byteNum=0;
		if(null==s){
			System.out.println("这是空值");
			return;
		}
		byteNum=s.length();
		byte bt[] =s.getBytes();
		if(bt[j]>byteNum){
			j=byteNum;
		}
		System.out.println(bt[j+1]);
		if(bt[j]<0){
			String sub=new String(bt,0,--j);
			System.out.println("subStr=="+sub);
		}else{
			String sub=new String(bt,0,j);
			System.out.println("subStr=="+sub);
		}
	}
	
}
