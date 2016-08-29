package com.qin;

import java.util.Scanner;

public class E_2 {
	public static void main(String args[]){
		ByteSizeException bs=new ByteSizeException();
		try {
			// a = 256;
			Scanner sc=new Scanner(System.in);
			byte n=sc.nextByte();
			//bs.check(n);
		} catch (Exception e) {
			// TODO: handle exception
			try {
				bs.check();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
	
}
