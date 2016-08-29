package com.qin.kh_1;

public class Players {
	private static int sum=0;
	private Players(){}
	public static Players create(){
		if(sum<11){
			sum++;
			System.out.println("创建了"+sum+"个对象");	
		}
		else{
			System.out.println("对不起，已经创建了11个对象了，不能再创建了");
		}
		return new Players();
		
		
	}
}
