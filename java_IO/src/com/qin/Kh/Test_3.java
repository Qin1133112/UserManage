package com.qin.Kh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Test_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="D:"+File.separator+"test"+File.separator+"Hello.txt";
		File f=new File(path);
		if(!f.exists()){
			f.createNewFile();
		}
		InputStream is=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		if(s!=null){
			System.out.println("从文件"+f+"中取出的内容是："+s);
		}
		br.close();
		isr.close();
		is.close();
		
		String s1=s.replace("l", "L");
		OutputStream os=new FileOutputStream(f);
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		bw.write(s1);
		bw.flush();
		bw.close();
		osw.close();
		os.close();
		
		 is=new FileInputStream(f);
		 isr=new InputStreamReader(is);
		 br=new BufferedReader(isr);
		String s2=br.readLine();
		if(s2!=null){
			System.out.println("通过过滤流写到文件"+f+"的内容是："+s2);
		}
		br.close();
		isr.close();
		is.close();
		System.out.println("读写完毕");
	}

}
