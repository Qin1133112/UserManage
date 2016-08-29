package com.qin.Kh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:"+File.separator+"Test"+File.separator+"Test.txt");
		File f2=new File("D:"+File.separator+"Test"+File.separator+"copyTest.txt");
		if(!f2.exists()){
			f2.createNewFile();
		}
		InputStream is=new FileInputStream(f);
		
		OutputStream os=new FileOutputStream(f2);
		byte[] b=new byte[(int) f.length()];
		if(is.read(b)>=0){
			os.write(b);
		}
		os.close();
		is.close();
		System.out.println("¸´ÖÆÍê³É");
		
		
	}

}
