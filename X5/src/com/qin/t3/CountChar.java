package com.qin.t3;

public class CountChar {

	public static void main(String[] args) {
		String s="want you to know one thing";
		char c[]=s.toCharArray();
		int count1=0,count2=0;
		for(int i=0;i<c.length;i++){
			if(c[i]=='n'){
				count1++;
			}
			if(c[i]=='o'){
				count2++;
			}
		}
		System.out.println("字母n出现的次数："+count1);
		System.out.println("字母o出现的次数："+count2);
	}

}
