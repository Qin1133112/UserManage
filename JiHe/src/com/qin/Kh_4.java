package com.qin;

import java.util.Arrays;
import java.util.HashMap;

public class Kh_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String[]> hm=new HashMap<String, String[]>();
		hm.put("1", new String[]{"李四","10000"});
		hm.put("2", new String[]{"李三","10200"});
		hm.put("3", new String[]{"李二","10500"});
		hm.put("4", new String[]{"李一","10900"});
		
		String[] a=(String[]) hm.get("3");
		System.out.println(Arrays.toString(a));
	}

}
