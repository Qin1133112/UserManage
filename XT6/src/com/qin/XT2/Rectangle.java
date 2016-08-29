package com.qin.XT2;

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle(float width,float length){
		this.length=length;
		this.width=width;
	}
	
	public float getArea(){
		float area=length*width;
		return area;
	}
	
	public float getPer(){
		float per=2*(length+width);
		return per;
	}
	
	public void showAll(){
		System.out.println("长方形的长："+length);
		System.out.println("长方形的宽："+width);
		System.out.println("长方形的面积："+getArea());
		System.out.println("长方形的周长："+getPer());
	}
}
