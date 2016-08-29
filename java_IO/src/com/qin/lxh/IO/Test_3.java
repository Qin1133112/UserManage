package com.qin.lxh.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Test_3 {
/*
 * 从键盘输入多个字符串到程序中
 * 并逆序输出在屏幕上
 */
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("输入字符串个数：");
		int n=sc.nextInt();*/
		System.out.println("输入字符串：");
		String s=sc.nextLine();
		//s.split(",");
		/*File f=new File("D:\\text.txt");
		Writer w=new FileWriter(f);
		w.write(s);
		w.close();
		Reader r=new FileReader(f);
		char c1[] =new char[s.length()];
		int lent=r.read(c1);
		r.close();
		System.out.println(new String(c1,lent,0));*/
		ByteArrayInputStream bis=new ByteArrayInputStream(s.getBytes());
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		int temp=0;
		while((temp=bis.read())!=-1){
			char c=(char) Character.toUpperCase(temp);
			
			bos.write(c);
		}
		String newStr=bos.toString();
		bis.close();
		bos.close();
		System.out.println(newStr);
	}
	
}
