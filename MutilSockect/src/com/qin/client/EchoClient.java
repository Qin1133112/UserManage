package com.qin.client;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {
	//private static Socket s;
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("127.0.0.1",3356);
		System.out.println("与服务器连接成功");
		Scanner sc=new Scanner(System.in);
		PrintStream ps=new PrintStream(new BufferedOutputStream(s.getOutputStream()));
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		boolean flag=true;
		while(flag){
			System.out.println("输入消息");
			String info=sc.next();
			if("bye".equals(info)){
				flag=false;
			}else{
				ps.println(info);
				ps.flush();
				System.out.println(br.readLine());
			}
		}
		br.close();
		ps.close();

	}

}
