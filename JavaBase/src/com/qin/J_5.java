package com.qin;

import java.util.Scanner;

public class J_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yishifenjie();
		//zhishu(20);
	}
	static void yishifenjie(){
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个数字：");
		int n=sc.nextInt();
		int b[]=zhishu(n);
		int a[]=new int[n];
		int k=0;
		for(int i=0;i<b.length;i++){
			if(b[i]!=0){
			a[k]=b[i];
			k++;
			}
//			System.out.print(b[i]+" ");
		}
		System.out.println();
//		for(int i=0;i<a.length;i++){
//			System.out.print(a[i]+" ");
//		}
		for(int i=0;i<a.length;i++){
			try {
				if (a[i] != 0) {
					int yushu = n % a[i];
					if (yushu == 0) {
						int shang = n / a[i];
						for (int j = 0; j < a.length; j++) {
							if (shang==a[j]) {
								System.out.println(a[i] + "*" + shang);
								//break;
							}/* else{
								System.out.println(a[i] + "*" + shang);
								yushu = shang % a[j];
								//System.out.println(a[i] + "*" + shang);
								break;
							}*/
						}
					}
					else{
						
					}
				}else{
					//System.out.println("AA");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}

	}
	
	static int[] zhishu(int n){
		int a[]=new int[n];
		for(int i=2;i<n;i++){
				boolean flag=true;
				for(int j=2;j<i;j++){
					if(i%j==0){
						flag=false;
						break;
					}
				}
				if(!flag){
					continue;
				}
				a[i]=i;
			//System.out.print(i+" ");
		}
		return a;
	}
}
