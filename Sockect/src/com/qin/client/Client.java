package com.qin.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
			client();
		
	}

	public static void client() throws UnknownHostException, IOException {
		System.out.println("客户端即将启动");
		Socket s=new Socket("127.0.0.1",3336);
		OutputStream os;
		OutputStreamWriter osw;
		BufferedWriter bw;
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
			os = s.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			bw.write(str);
			bw.flush();
			s.shutdownOutput();
			is = s.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String info = br.readLine();
			System.out.println(info);
			s.shutdownInput();
			br.close();
			isr.close();
			is.close();
			
			bw.close();
			osw.close();
			os.close();
			s.close();
		
		
	}
	
	

}
