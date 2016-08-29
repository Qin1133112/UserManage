package com.qin.t6;

public class CharWays {
	public static void main(String args[]){
		String s1="Java技术学习班20070326";
		String s=s1.substring(9);
		System.out.println("开班日期："+s);
		String s2="MLDN JAVA";
		s=s2.replace("JAVA", "J2EE");
		System.out.println("替换后："+s);
		s=s1.substring(7, 8);
		System.out.println(s1+"的第八个字符为："+s);
		s=s1.replace("0", "");
		System.out.println(s1+"去掉所有0后："+s);
		String s3="Java技术学习班   20070326 MLDN 老师";
		s=s3.replace(" ", "");
		System.out.println(s3+"去掉所有空格后："+s);
		String s4="678123199507142230";
		s=s4.substring(6, 14);
		System.out.println("此人的出生日期："+s);
	}
}
