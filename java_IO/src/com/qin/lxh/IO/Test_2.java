package com.qin.lxh.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test_2 {
/*
 * 从键盘输入文件内容和要保存的文件名称
 * 然后根据输入的名称创建文件
 * 并将内容保存到文件中
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("输入文件的内容：");
		String s=sc.nextLine();
		System.out.println("输入文件名称：");
		String m=sc.next();
		String path="D:"+File.separator+"test"+File.separator+m+".txt";
		File f=new File(path);
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			os=new FileOutputStream(f);
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			
			try {
				bw.write(s);
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(bw!=null){
				bw.close();
			}
				
			if(osw!=null){
				osw.close();
			}
				
			if(os!=null){
				os.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("流没有正常关闭");
			e.printStackTrace();
		}
		
		System.out.println("完成");
		
	}

}
