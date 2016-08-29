package com.qin;

import java.util.Arrays;

public class J_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomSort();
	}
	static void randomSort(){
		int[] a=new int[100];
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*100+1);
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
