package com.qin.stream;

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

public class Buff {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:"+File.separator+"test.txt");
		File fo=new File("D:"+File.separator+"test123.txt");
		if(!fo.exists()){
			fo.createNewFile();
		}
		InputStream is=new FileInputStream(f);
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		OutputStream os=new FileOutputStream(fo);
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		int i=0;
		while(true){
			i++;
			String s=br.readLine();
			String s1="";
			if(s!=null){
				System.out.println(s);
				s1="第"+i+"行是:"+s+"\r\n";
				bw.write(s1);
			}else{
				System.out.println("文件结束");
				break;
			}
		}
		bw.close();
		osw.close();
		os.close();
		br.close();
		isr.close();
		is.close();
	}

}
