package com.qin.Kh.server;

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

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss;
		try {
			ss = new ServerSocket(7001);
			Socket s=ss.accept();
			InputStream is=s.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			String str=br.readLine();
			String[] strgroup=str.split(" ");
			int[] n=new int[strgroup.length];
			for(int i=0;i<n.length;i++){
				n[i] = Integer.parseInt(strgroup[i]);
			}
			Arrays.sort(n);
			String rtn="";
			for(int i=0;i<n.length;i++){
				rtn+=n[i]+" ";
			}
			OutputStream os=s.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			BufferedWriter bw=new BufferedWriter(osw);
			bw.write(rtn);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*bw.close();
		osw.close();
		os.close();
		br.close();
		isr.close();
		is.close();
		s.close();
		ss.close();*/
	}

}
