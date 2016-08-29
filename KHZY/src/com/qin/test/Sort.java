package com.qin.test;

import java.util.Comparator;

public class Sort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(o1);
		int b=Integer.parseInt(o1);
		if(a>b){
			int temp=a;
			a=b;
			b=temp;
		}
		return 1;
	}

}
