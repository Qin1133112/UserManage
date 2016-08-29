package com.qin.Thread;

import java.util.Date;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		timer t=new timer();
		
		for(int i=0;i<10;i++){
			Thread t1=new Thread(t);
			t1.start();
			Thread.sleep(1000);
		}
		
	}
	
}
class timer implements Runnable{

	@SuppressWarnings("deprecation")
	 void time(){
		Date d=new Date();
		//System.out.println(d);
		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		time();
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}