package com.qin;

import java.io.File;

public class File_xixi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File my=new File("D:"+File.separator);//²Ù×÷Â·¾¶
		print(my);
	}
	public static void print(File file){
		if(file!=null){
			if(file.isDirectory()){
				File f[]=file.listFiles();
				if(f!=null){
					for(int i=0;i<f.length;i++){
						print(f[i]);
					}
				}
			}else{
				System.out.println(file);
			}
		}
	}

}
