package com.qin.kh_4;

public class SalesEmploee extends ColaEmployee {
	private double monSale;
	private double per;
	private int month;
	SalesEmploee(String name,int birMonth,double monSale,double per,int month){
		super(name,birMonth);
		this.monSale=monSale;
		this.month=month;
		this.per=per;
	}
	double getSalary(double monSale,double per){
		double a=super.getSalary(month);
		return monSale*per+a;
	}
}
