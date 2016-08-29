package com.qin;

import java.util.ArrayList;
import java.util.Iterator;

public class List1 {

	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<String>();
		ArrayList<String> l1=new ArrayList<String>();
		l.add("str");
		l.add("dhjddsdds");
//		System.out.println(l.get(0));
//		System.out.println(l.lastIndexOf("str"));
//		System.out.println(l.isEmpty());
//		System.out.println(l1.isEmpty());
		l1.addAll(l);
		l1.add("djsakl");
		l1.add("jdfjsi");
//		System.out.println(l1.isEmpty());
//		System.out.println(l.size());
		l1.addAll(l);
		//System.out.println(l1.size());
		//l.remove(0);

	//		System.out.println(l.size());
	//		System.out.println(l.get(0));
	//		System.out.println(l.getClass());
	//		System.out.println(l.getClass().getMethods());
	//		System.out.println(l.contains(l1.get(0)));
	//		System.out.println(l1.containsAll(l));
		try {
				Iterator<String> it = l1.iterator();
				while (it.next() != null) {
					System.out.println(it.next().toString());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		
	}


}
