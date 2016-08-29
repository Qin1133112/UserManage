package com.qin.kh_2;

public class Circle extends Shape {
	private double radius;
	private String corlor;
	double getArea() {

		return 3.14*radius*radius;
	}

	double getPer() {
		return 3.14*2*radius;
	}
	void showAll() {
		System.out.println("圆形的半径："+this.radius+"cm");
		System.out.println("圆形的面积："+this.getArea()+"cm2");
		System.out.println("圆形的周长："+this.getPer()+"cm");
		System.out.println("圆形的颜色："+this.corlor);
	}
	Circle(){
		
	}
	Circle(double radius,String corlor){
		this.radius=radius;
		this.corlor=corlor;
	}
}
