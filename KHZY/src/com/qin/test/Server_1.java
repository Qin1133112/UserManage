package com.qin.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server_1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ServerSocket ss=new ServerSocket(7001);
		System.out.println("服务器启动");
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		String r=br.readLine();
		s.shutdownInput();
		
		String[] str=r.split(" ");
		String str1="";
		int[] a=new int[str.length];
		for(int i=0;i<a.length;i++){
			
			try {
				a[i] = Integer.parseInt(str[i]);
			} catch (Exception e) {
				str1="数据格式不对";
				System.out.println(str1);
				break;
				// TODO: handle exception
			}
		}
		Arrays.sort(a);
		if(str1==null){
			for(int i=0;i<a.length;i++){
				str1 +=a[i]+" ";
			}
		}
		
		
		
//		ArrayList<String> al=new ArrayList<String>();
//		for(int i=0;i<str.length;i++){
//			al.add(str[i]);
//		}
//		System.out.println(al.toString());
//		Sort sort=new Sort();
//		Collections.sort(al);
//		System.out.println(al.toString());
//		String str1="";
//		for(int i=0;i<al.size();i++){
//			str1 +=al.get(i)+" ";
//		}
//		System.out.println(str1);
		OutputStream os=s.getOutputStream();
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		
		bw.write(str1);
		bw.flush();
		s.shutdownOutput();
		bw.close();
		osw.close();
		os.close();
		
	}

}
