package com.qin.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:"+File.separator+"test.txt");
		File f1=new File("D:"+File.separator+"testnew.txt");
		if(!f1.exists()){
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		InputStream is=null;
		OutputStream os=null;
		try {
			is=new FileInputStream(f);
			os=new FileOutputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//方法一
		/*byte [] b=new byte[128];
		int pos=0;
		try {
			while(is.read(b, pos, 128)>-1){
				os.write(b);
			}
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}*/
		
		//方法二
		byte [] b1=new byte[(int) f.length()];
		try {
			while(is.read(b1)>-1){
				os.write(b1);
			}
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("复制完成");
	}


}
