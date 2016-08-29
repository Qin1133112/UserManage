package com.qin;

public class J_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jueduizhi(-7);
	}
	static int jueduizhi(int n){
		if(n>=0){
			n=n;
			System.out.println(n+"的绝对值为："+n);
		}else{
			
			System.out.println(n+"的绝对值为："+(-n));
			n=-n;
		}
		return n;
	}
}
