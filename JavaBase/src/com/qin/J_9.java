package com.qin;

import java.util.Arrays;
import java.util.Scanner;

public class J_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("排序的整数个数：");
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void sort(int[] a){
		for(int i=0;i<a.length;i++){	
			for(int j=i;j<a.length;j++){
				if(a[j]>a[i]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
