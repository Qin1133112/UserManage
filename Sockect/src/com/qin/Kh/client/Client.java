package com.qin.Kh.client;

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

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Socket s;
		try {
			s = new Socket("127.0.0.1",7001);
			System.out.println("客户端启动，请输入数据：");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			OutputStream os=s.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			BufferedWriter bw=new BufferedWriter(osw);
			bw.write(str);
			bw.flush();
			
			InputStream is=s.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			String rnt=br.readLine();
			System.out.println(rnt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*br.close();
		isr.close();
		is.close();
		bw.close();
		osw.close();
		os.close();
		s.close();*/
	}

}
