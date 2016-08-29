package com.qin.kh_4;

public class SalariedEmployee extends ColaEmployee {
	private double sal;
	private int month;
	SalariedEmployee(String name,int birMonth,double sal,int month){
		super(name,birMonth);
		this.month=month;
		this.sal=sal;
	}
	double getSalary(double sal){
		double a=super.getSalary(month);
		return sal+a;
	}
}
