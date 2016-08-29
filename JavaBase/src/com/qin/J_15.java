package com.qin;

import java.util.Scanner;

public class J_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count2();
	}
	static void count(){
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String s=sc.nextLine();
		//String s="    anhAJALKLAKLA 342984928420821174817487214298410418][]P[P[alkdkodxoad[p;;Kdjdjasd";
		char [] a=s.toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]>='a' && a[i]<='z' || a[i]>='A' && a[i]<='Z'){
				count1++;
			}
			else if(a[i]>=48&&a[i]<=57){
				count2++;
			}
			else if(a[i]==32){
				count3++;
			}
			else{
				count4++;
			}
		}
		System.out.println("英文字母个数："+count1);
		System.out.println("数字字符个数："+count2);
		System.out.println("空格字符个数："+count3);
		System.out.println("其他字符个数："+count4);
	}
	
	
	static void count1(){
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String s=sc.nextLine();
		String s1=s.replaceAll("[a-z|A-Z]", "");
		count1=s.length()-s1.length();
		String s2=s.replaceAll("[0-9]", "");
		count2=s.length()-s2.length();
		String s3=s.replaceAll("\\x20", "");
		count3=s.length()-s3.length();
		count4=s.length()-count1-count2-count3;
		System.out.println("英文字母个数："+count1);
		System.out.println("数字字符个数："+count2);
		System.out.println("空格字符个数："+count3);
		System.out.println("其他字符个数："+count4);
	}
	static void count2(){
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String s=sc.nextLine();
		//String s="    anhAJALKLAKLA 342984928420821174817487214298410418][]P[P[alkdkodxoad[p;;Kdjdjasd";
		char [] a=s.toCharArray();
		for(int i=0;i<a.length;i++){
			if(Character.isLetter(a[i])){
				count1++;
			}
			else if(Character.isDigit(a[i])){
				count2++;
			}
			else if(Character.isSpaceChar(a[i])){
				count3++;
			}
			else{
				count4++;
			}
		}
		System.out.println("英文字母个数："+count1);
		System.out.println("数字字符个数："+count2);
		System.out.println("空格字符个数："+count3);
		System.out.println("其他字符个数："+count4);
	}
}
