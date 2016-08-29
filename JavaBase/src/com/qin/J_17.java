package com.qin;

public class J_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s=sum(20);
		double s2=sum1(2,1,20);
		System.out.println(s);
		System.out.println(s2);
	}
	
	//非递归方法求2/1+3/2+5/3+8/5+13/8+...+...的和
	static double sum(int n){
		int fenzi=2;
		int fenmu=1;
		//int n=20;
		double[] shu=new double[n];
		shu[0]=(double)2/1;
		for(int i=1;i<n;i++){
			int temp=fenmu;
			fenmu=fenzi;
			fenzi=fenzi+temp;
			shu[i]=(double)fenzi/fenmu;
			
			//System.out.print(fenzi+"/"+fenmu+"+");
		}
		double sum=0;
		for(int i=0;i<shu.length;i++){
			sum=sum+shu[i];
		}
		return sum;
	}
	static double sum=0;
	static double sum1(int fenzi,int fenmu,int n){
		
		if(n>0){
			sum+=1.0*fenzi/fenmu;
			sum1(fenzi+fenmu,fenzi,n-1);
		}
		//System.out.println(sum);
		return sum;
	}
}
