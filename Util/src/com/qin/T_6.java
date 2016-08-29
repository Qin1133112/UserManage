package com.qin;

public class T_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count("hulenishdd","sh");
	}
	static int count(String s1,String s2){
		int count=0;
		for(int i=0;i<s1.length()&&i+s2.length()<s1.length();i++){
			if(s1.substring(i, s2.length()+i).equals(s2)){
				count++;
			}
		}
		System.out.println("´ÎÊýÎª£º"+count);
		return count;
	}
}
