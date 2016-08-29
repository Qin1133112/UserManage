package com.qin.T7_1;

public class Officer {
	String name;
	String birth;
	int age;
	double sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	protected void getDetil(){
		System.out.println("父类中等getDetil()方法");
		System.out.println("name="+name+" birth="+birth+" age="+age+" sal="+sal);
	}
	public double getSalary(){
		System.out.println(sal);
		return sal;
	}
}
