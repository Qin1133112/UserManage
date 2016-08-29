package com.qin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Kh_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<String>();
		l.add("apple");
		l.add("grape");
		l.add("banana");
		l.add("pear");
		String  max=Collections.max(l);
		String min=Collections.min(l);
//		l.add(1);
//		l.add(2);
//		l.add(7);
//		l.add(3);
//		int max=Collections.max(l);
//		int min=Collections.min(l);
		
		System.out.println("max="+max);
		System.out.println("min="+min);
		
		Collections.sort(l);
		Iterator<String> it=l.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}

}
