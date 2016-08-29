package com.qin.t9;

public class Book {
	private String bookName;
	private static int bno=0;
	private float price;
	private static int bnum=0;
	private static int count=0;
	public Book(){
		
	}
	public Book(String bookName,float price){
		this.bookName=bookName;
		this.price=price;
		bno ++;
		//bnum++;
	}
	public void show(){
		System.out.println("第"+bnum+"本书的书名："+this.bookName+ "  价格为："+this.price+"元          编号为："+this.bno);
	}
	public void getBnum(){
		bnum++;
		System.out.println("册数为："+bnum);
	}
	public void sum(Book[] book){
		for(int i=0;i<book.length;i++){
			//bnum++;
			count++;
			//System.out.println("总册数为："+count);
		}
		System.out.println("总册数为："+count);
	}
	
}
