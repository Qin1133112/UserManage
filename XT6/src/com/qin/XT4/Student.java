package com.qin.XT4;

public class Student {
	private String name;
	private int sno;
	private float score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public Student(){
		
	}
	
	public Student(String name, int sno, float score) {
		this.name = name;
		this.sno = sno;
		this.score = score;
	}
	public void showInfo(){
		System.out.println(name+"    "+sno+"  "+score);
	}
	
}
