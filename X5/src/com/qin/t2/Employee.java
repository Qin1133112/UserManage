package com.qin.t2;

public class Employee {
	private String eno;//员工编号
	private String name;
	private float sal;//基本薪水
	private float per;//薪水增长额
	public void setEno(String eno){
		this.eno=eno;
	}
	public String getEno(){
		return eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	//薪水增长额
	public float incre(){
		return sal*per;
	}
	
	//增长后工资总额
	public float sum(){
		return sal*(1+per);
	}
	
}
