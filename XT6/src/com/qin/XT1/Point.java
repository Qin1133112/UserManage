package com.qin.XT1;

public class Point {
	private int x;
	private int y;
	
	public Point(){
		System.out.println("横坐标为："+this.x);
		System.out.println("纵坐标为："+this.y);
	}
	
	public Point(int x0,int y0){
		this.x=x0;
		this.y=y0;
		System.out.println("横坐标为："+this.x);
		System.out.println("纵坐标为："+this.y);
	}
	
	public void movePoint(int dx,int dy){
		this.x=this.x-dx;
		this.y=this.y-dx;
		System.out.println("横坐标为："+this.x);
		System.out.println("纵坐标为："+this.y);
	}
}
