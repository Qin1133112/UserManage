package com.qin.XT7;

public class Vehicle {
	private String brand="zizi";
	private String corlor;
	private double speed;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCorlor() {
		return corlor;
	}
	public void setCorlor(String corlor) {
		this.corlor = corlor;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Vehicle() {
		this.brand="福特";
		this.corlor="黑色";
		this.speed=0;
	}
	public Vehicle(String brand, String corlor, double speed) {
		super();
		this.brand = brand;
		this.corlor = corlor;
		this.speed = speed;
	}
	public Vehicle(String brand, String corlor) {
		super();
		this.brand = brand;
		this.corlor = corlor;
		this.speed = 0;
	}
	public void run(){
		System.out.println(corlor+"的"+brand+"的速度是"+speed);
	}
	
}
