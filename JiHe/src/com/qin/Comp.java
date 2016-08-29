package com.qin;

import java.util.Comparator;

public class Comp implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String int1=o1.toString();
		String int2=o2.toString();
		int r=int1.compareToIgnoreCase(int2);
		return r;
	}

}
