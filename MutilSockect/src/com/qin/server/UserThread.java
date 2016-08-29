package com.qin.server;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class UserThread implements Runnable {
	private Socket s;
	
	public UserThread(Socket s){
		this.s=s;
	}
	@Override
	public void run() {
		System.out.println("已经与客户端连接....");
		System.out.println(s.getInetAddress().getHostAddress()+"已经连接");
		
		
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream ps=new PrintStream(new BufferedOutputStream(s.getOutputStream()));
			boolean bool=true;
			while(bool){
				String info=br.readLine();
				if("".equals(info)||"bye".equals(info)){
					bool=false;
					break;
				}else{
					Scanner sc=new Scanner(System.in);
					System.out.println(info);
					ps.println("echo: "+info);
					/*System.out.println("请输入信息：");
					String str=sc.next();
					byte[] b=str.getBytes();
					if(b.length>=0){
						ps.write(b);
					}*/
					ps.flush();
				}
			}
			br.close();
			ps.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
