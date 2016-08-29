package com.qin.kh_2;

public class Rectangle extends Shape {
	private double area;
	private double per;
	private String corlor;
	private double width;
	private double height;
	
	double getArea() {
		return area=width*height;
		//System.out.println("长方形面积："+area);

	}


	double getPer() {
		return per=2*(width+height);
		//System.out.println("长方形面积："+per);

	}


	void showAll() {

		System.out.println("长方形的高："+this.height+"cm");
		System.out.println("长方形的宽："+this.width+"cm");
		System.out.println("长方形的面积："+this.getArea()+"cm2");
		System.out.println("长方形的周长："+this.getPer()+"cm");
		System.out.println("长方形的颜色："+this.corlor);
	}
	Rectangle(){
		
	}
	Rectangle(double width,double height,String corlor){
		this.width=width;
		this.height=height;
		this.corlor=corlor;
	}

}
