package com.qin;

import java.util.LinkedList;

public class Kh_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList L=new LinkList();
		L.put("one");
		L.put("two");
		L.put("three");
		
		System.out.println(L.isEmpty());
		while(!L.isEmpty()){
			System.out.println(L.get());	
		}
		
		//L.get();
	}
	
}
class LinkList{
	LinkedList<Object> L=new LinkedList<Object>();
	void put(Object o){
		L.add(o);
	}
	Object get(){
		Object o=L.get(0);
		L.remove(o);
		return o;
	
	}
	boolean isEmpty(){
		if(L.size()==0){
			return true;
		}
		return false;
	}
}
