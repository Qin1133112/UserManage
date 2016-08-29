package com.qin.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoService {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(3356);
		System.out.println("服务器已经打开，等待连接......");
		boolean flag=true;
		while(flag){
			Socket s=ss.accept();
			new Thread(new UserThread(s)).start();
		}
		
	}

}
