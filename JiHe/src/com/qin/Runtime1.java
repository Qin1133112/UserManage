package com.qin;

public class Runtime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		System.out.println(r.getRuntime());
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory());
		System.out.println(r.availableProcessors());
		System.out.println(r.toString());
	}

}
