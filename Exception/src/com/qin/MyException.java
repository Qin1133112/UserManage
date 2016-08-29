package com.qin;

public class MyException extends Exception {
	public void print() {
		System.out.println("捕捉到我的异常");
	}
}
