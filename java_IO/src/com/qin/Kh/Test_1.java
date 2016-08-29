package com.qin.Kh;

import java.io.File;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:"+File.separator+"test";
		File f=new File(path);
	
		//fileName(f);
		filesPath(f);	

	}
	static void filesPath(File f){
		//String[] n=f.list();
		if(f.isDirectory()){
			File[] f1=f.listFiles();
			if(f1!=null){
				for(int i=0;i<f1.length;i++){
					//System.out.println("文件名："+n[i]);
					filesPath(f1[i]);
					//System.out.println("---------------------------");
				}
			}
		}else{
			System.out.println("文科名："+f.getName());
			System.out.println("路径名："+f.getPath());
			System.out.println("---------------------------");
	}
		
	}
	static void fileName(File f){
		String[] n=f.list();
		for(int i=0;i<n.length;i++){
			System.out.println("文件名："+n[i]);
		}
		
	}
}
