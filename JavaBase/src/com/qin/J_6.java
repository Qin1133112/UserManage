package com.qin;

public class J_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=8;i+=2){
			for(int j=1;j<i;j++){
				if(j<=7){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=5;i>0;i=i-2){
			for(int j=i;j>0;j--){
				if(j>=0){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
	}

}
