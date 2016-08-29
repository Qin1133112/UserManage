package com.qin;

public class T_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T_5 t=new T_5();
		t.testmail();
	}
	public boolean testmail(){
		String s="1272163@163.com";
		int s1=s.indexOf(".");
		//System.out.println(s1);
		int s2=s.indexOf("@");
		//System.out.println(s2);
		if(s1<s2){
			System.out.println("邮箱地址中.出现在@的前面！");
		}
		char[] a=s.toCharArray();
		int count1=0,count2=0,sum1=0,sum2=0;
		for(int i=0;i<a.length;i++){
			if(a[i]=='@'){
				count1++;
				sum1=i;
				//System.out.println(count1);
			}
			if(a[i]=='.'){
				count2++;
				sum2=i;
				//System.out.println(count2);
			}
		}
		//boolean flag=true;
		{
			if(count1>=2){
				System.out.println("邮箱中包含了多个@");
				//flag=false;
			}
			else if(count1<=0){
				System.out.println("邮箱中不包含@");
				//flag=false;
			}
			if(count2>=2){
				System.out.println("邮箱中包含了多个。");
				//flag=false;
			}
			else if(count2<=0){
				System.out.println("邮箱中不包含。");
				//flag=false;
			}
		}
		{
			
			String u=s.substring(0,sum1);
			System.out.println("用户名为："+u);
			String ym=s.substring((sum1+1));
			System.out.println("网站域名为："+ym);
		}
			
		
		return true;
	}
}
