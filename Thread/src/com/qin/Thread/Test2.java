package com.qin.Thread;

public class Test2  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Run1 r1=new Run1();
		Thread t1=new Thread(r1); 
		t1.start();
		t1.sleep(100);
		Run2 r2=new Run2();
		Thread t2=new Thread(r2); 
		t2.start();
		t2.sleep(100);
		Run3 r3=new Run3();
		Thread t3=new Thread(r3); 
		t3.start();
	}

}
class Run1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=1;i<=1000;i++){
			if(i==2){
				flag=true;
			}
			for(int j=2;j<i;j++){
				
				if(i%j==0){
					flag=false;
					break;
				}else{
					flag=true;
				}
			}
			if(flag){
				System.out.print(i+"  ");
			}
			
		}
		System.out.println();
	}

}
class Run2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=1001;i<=2000;i+=2){
			for(int j=2;j<Math.sqrt(i);j++){
				if(i%j==0){
					flag=false;
					break;
				}else{
					flag=true;
				}
			}
			if(flag){
				System.out.print(i+"  ");
			}
			
		}
		System.out.println();
	}

}
class Run3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=false;
		for(int i=2001;i<=3000;i+=2){
			for(int j=2;j<Math.sqrt(i);j++){
				if(i%j==0){
					flag=false;
					break;
				}else{
					flag=true;
				}
			}
			if(flag){
				System.out.print(i+"  ");
			}
			
		}
		System.out.println();
	}

}