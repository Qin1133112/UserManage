package com.qin.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server_2 {
	static List<Socket> l=new ArrayList<Socket>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(4001);
		System.out.println("服务启动");
		while(true){
			Socket s=ss.accept();
			System.out.println(s.getInetAddress()+"发送请求");
			l.add(s);
			One o=new One();
			Thread t=new Thread(o);
			t.start();
		}
	}

}
