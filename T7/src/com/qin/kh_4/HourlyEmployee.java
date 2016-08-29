package com.qin.kh_4;

public class HourlyEmployee extends ColaEmployee {
	private int hours;
	private double hoursSal;
	private int month;
	HourlyEmployee(String name,int birMonth,int hours,double hoursSal){
		super(name,birMonth);
		this.hours=hours;
		this.hoursSal=hoursSal;
	}
	double getSalary(){
		double a=super.getSalary(month);
		//double sal=0;
		if(hours>160){
			double sal=1.5*hoursSal*(hours-160)+hoursSal*160;
			return sal+a;
		}
		else{
			return hoursSal*hours+a;
		}
	}
}
