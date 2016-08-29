package com.qin.t9;

public class Test {

	public static void main(String[] args) {
		Book[] b=new Book[5];
		b[0]=new Book("qih",1f);
		b[0].show();
		b[1]=new Book("nsd",9f);
		b[1].show();
		b[2]=new Book("qih",1f);
		b[2].show();
		b[3]=new Book("nsd",9f);
		b[3].show();
		b[4]=new Book("qih",1f);
		b[4].show();
		Book b1=new Book();
		
//		for(int i=0;i<b.length;i++){
//			b[i].getBnum();
//		}
		b1.sum(b);
	}

}
