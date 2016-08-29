package com.qin.kh_4;

public class ColaEmployee {
	private String name;
	private int  birMonth;
	ColaEmployee(){
		
	}
	ColaEmployee(String name,int birMonth){
		this.birMonth=birMonth;
		this.name=name;
	}
	double getSalary(int month){
		double sal=0;
		if(month==birMonth){
			return sal+100;
		}
		else{
			return sal;
		}
	}
	
}
