package com.qin.kh_2;

public abstract class Shape {
	private double area;
	private double per;
	private String corlor;
	
	Shape(){
		
	}
	Shape(String corlor){
		this.corlor=corlor;
	}
	
	abstract double getArea();
	
	abstract double getPer();
	
	abstract void showAll();
	
	String getCorlor(){
		return corlor;
	}
	
}
