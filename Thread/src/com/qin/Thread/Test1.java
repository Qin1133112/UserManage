package com.qin.Thread;

public class Test1  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		t1.start();
		t1.sleep(100);
		t2.start();
		t2.sleep(100);
		t3.start();
		//System.out.println("Ïß³Ìmain½áÊø");
	}

}
class Thread1 extends Thread{
	public void run(){
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
class Thread2 extends Thread{
	public void run(){
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


class Thread3 extends Thread{
	public void run(){
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