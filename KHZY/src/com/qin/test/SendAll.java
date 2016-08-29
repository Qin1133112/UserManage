package com.qin.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendAll implements Runnable {

	
	private Socket s;
	
	
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=null;
		try {
			while(true){
				String str=br.readLine();
				for(Socket s:Server_2.l){
					pw=new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
					pw.println(str);
					pw.flush();
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			pw.close();
		}
		
	}
	
	
}
