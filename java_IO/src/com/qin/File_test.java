package com.qin;

import java.io.File;
import java.io.IOException;

public class File_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:"+File.separator);
		//System.out.println(f.exists());
		{
			try {
				f.createNewFile();
				System.out.println(f.exists());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			f.canRead();
			f.canWrite();
			
			//f.list()   f.listFiles()
			String[] s=f.list();
			File[] s1=f.listFiles();
				for(int i=0;i<s.length;i++){
				System.out.println(s[i]);
				//System.out.println(s1[i]);
			}
			System.out.println(s);
			f.delete();
			System.out.println(f.exists());
		}
	}

}
