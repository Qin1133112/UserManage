package com.qin.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			server();

	}

	public static void server() throws IOException {
		ServerSocket ss=new ServerSocket(3336);
		System.out.println("服务器即将启动......");
		Socket s=ss.accept();
		while (true) {
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String info = br.readLine();
			System.out.println(info);
			s.shutdownInput();
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("你好，我是服务器");
			bw.flush();
			s.shutdownOutput();
			bw.close();
			osw.close();
			os.close();
			s.close();
			br.close();
			isr.close();
			is.close();
		}
	}
	
	

}
