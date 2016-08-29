package com.qin;

public class J_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(8);
	}
	static int sum(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("sum="+sum);
		return sum;
	}
}
