package com.qin.Thread;

public class Test3  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread4 t1=new Thread4();
		Thread5 t2=new Thread5();
		t1.setPriority(10);
		t2.setPriority(6);
		t1.start();
		t2.start();
		
	}

}
 class Thread4 extends Thread {

	public void run(){
		// TODO Auto-generated method stub
		for(int i=0;i<200;i++)
		System.out.println("线程1正在运行"+i);
	}

}
 class Thread5 extends Thread {

		public void run(){
			// TODO Auto-generated method stub
			for(int i=0;i<200;i++)
			System.out.println("线程2正在运行"+i);
		}

	}
