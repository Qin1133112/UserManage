package com.qin.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class One implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Socket s=Server_2.l.get(Server_2.l.size()-1);
		String str="";
		SendAll st=new SendAll();
		Thread t1=new Thread(st);
		t1.start();
		try {
				while(true){
					BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
					str=br.readLine();
					System.out.println("客户端"+s.getInetAddress()+"说："+str);
				}
			}
		
			catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(s.getInetAddress()+"用户下线");
				Server_2.l.remove(s);
				e.printStackTrace();
			}
			
		}
	

}
