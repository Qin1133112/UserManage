package com.qin.XT5;

public class Person {
	private String name;
	private float hight;
	private float weigth;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHight() {
		return hight;
	}
	public void setHight(float hight) {
		this.hight = hight;
	}
	public float getWeigth() {
		return weigth;
	}
	public void setWeigth(float weigth) {
		this.weigth = weigth;
	}
	public Person(){
		
	}
	public Person(String name,float hight,float weight){
		this.name=name;
		this.hight=hight;
		this.weigth=weight;
	}
	public void sayHello(){
		System.out.println("Hello,my name is "+name);
		System.out.println("我的身高是："+hight+"米");
		System.out.println("我的体重是："+weigth+"公斤");
	}
	
}
