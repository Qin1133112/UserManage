package com.qin.Kh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Test_4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String path="D:"+File.separator+"test"+File.separator+"student.txt";
		File f=new File(path);
		if(!f.exists()){
			f.createNewFile();
		}
		OutputStream os=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(os);
		Student stu=new Student();
		stu.setId(1001);
		stu.setBirth("1999-10-23");
		stu.setName("李明");
		oos.writeObject(stu);
		oos.flush();
		oos.close();
		os.close();
		
		
		InputStream is =new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(is);
		Student getStu=(Student) ois.readObject();
		System.out.println("学号："+getStu.getId());
		System.out.println("姓名："+getStu.getName());
		System.out.println("出生日期："+getStu.getBirth());
		ois.close();
		is.close();
	
	}

}
class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String birth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}
