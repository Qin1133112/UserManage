package com.qin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Kh_5 {


	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		List<String> l=new ArrayList<String>();
		System.out.println(" ‰»Îµ•¥ ");
		String n=sc.nextLine();
		String[] a=n.split(",");
		for(int i=0;i<a.length;i++){
			l.add(a[i]);
		}
		Comp c=new Comp();
		Collections.sort(l,c);
		Iterator<String> it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
