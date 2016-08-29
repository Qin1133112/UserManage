package com.qin;

import java.util.Arrays;
import java.util.Scanner;

public class XT4_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		T1();
		System.out.println("******************************************************************");
		T2();
		System.out.println("******************************************************************");
		T3();
		System.out.println("******************************************************************");
		T5();
		System.out.println("******************************************************************");
		T6();
		System.out.println("******************************************************************");
		duijiaoxian();
		System.out.println("******************************************************************");
		paixu();
		System.out.println("******************************************************************");
		jiaohuan();
		System.out.println("******************************************************************");
		T10();
		System.out.println("******************************************************************");
		System.out.println("请输入长方形的长：");
		int a=sc.nextInt();
		System.out.println("请输入长方形的宽：");
		int b=sc.nextInt();
		int c=seque(a,b);
		System.out.println("矩形的面积为："+c);
		
	}
	static void T1(){
		int sum=0;
		int i=1;
		int ji=1;
		for(i=1;i<=30;i++){
			for(int j=i;j>0;j--){
				ji=ji*j;
				
			}
			sum=sum+ji;		
		}
		
		System.out.println((i-1)+"的阶乘之和："+sum);
	}
	static void T2(){
		int [] a={1,3,4,5,3,2,4,4,5,6,7,8,99};
		int count1=0,count2=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				count1++;
			}else{
				count2++;
			}
		}
		System.out.println("数组中的偶数个数为："+count1);
		System.out.println("数组中的奇数个数为："+count2);
	}
	static void T3(){
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		System.out.println("oldArr:"+Arrays.toString(oldArr));
		int newArr[]=new int[12];
		int temp[]=new int[oldArr.length];
		int j=0;
		for(int i=0;i<oldArr.length;i++){
			if(oldArr[i]!=0){
				temp[j]=oldArr[i];
				j++;
			}
		}
		for(int i=0;i<12;i++){
			newArr[i]=temp[i];
		}
		System.out.println("temp:  "+Arrays.toString(temp));
		System.out.println("newArr:"+Arrays.toString(newArr));
	}
	static void T5(){
		Scanner sc=new Scanner(System.in);
		System.out.println("输入数组长度：");
		int n=sc.nextInt();
		System.out.println("输入一组数字：");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("输入一个数字：");
		int b=sc.nextInt();
		int flag=1;
		for(int j=0;j<n&&flag==1;j++){
			if(b==a[j]){
				System.out.println("数字"+b+"存在于数组当中，其下标是:"+j);
				//break;
			}/*else{
				flag=0;
				System.out.println("不存在数字"+b+"在数组中");
			}*/
			//break;
		}
	}
	
	static void T6(){
		int [] a=new int[10];
		for(int i=0;i<10;i++){
			a[i]=i;
		}
		System.out.print(Arrays.toString(a));
		System.out.println();
		int [] b=new int[10];
		int j=9;
		for(int i=0;i<10;i++){
			b[i]=a[j];
			j--;
		}
		System.out.print(Arrays.toString(b));
		System.out.println();
	}
	
	static void duijiaoxian(){
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int sum=0,i=0,j=0;
		for(i=0;i<a.length;i++){
			
			for(j=0;j<a[0].length;j++){
				//int sum=0;
				if(i==j||(i+j==2)){
					 sum=sum+a[i][j];
				}
				System.out.println("a["+i+"]["+j+"]="+a[i][j]+" ");
			}
		}
		
		System.out.print("矩阵对角线之和："+sum);
		System.out.println();
	}
	static void paixu(){
		int a[][]={{1,5,6,8,9},{5,7,3,6,5},{8,3,5,7,9}};
		int b[]=new int[5];
		int i=0;
		for(int j=0;j<a.length;j++){
			for(i=0;i<a[j].length;i++){
				b[i]=a[j][i];
				//Arrays.sort(b);
			}
			//System.out.println(Arrays.toString(b));
			Arrays.sort(b);
			System.out.println(Arrays.toString(b));
		}
	}
	
	static void jiaohuan(){
		System.out.println("输入一个数组个数：");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("输入"+n+"个数字：");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("输入第"+i+"个数字：");
			a[i]=sc.nextInt();
		}
		System.out.println("原数组："+Arrays.toString(a));		
		int max=a[0],temp1=a[0], p1=0,p2=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
				p1=i;
			}
			
		}
		a[0]=max;
		a[p1]=temp1;
//		System.out.print("max="+max+" p1="+p1);
//		System.out.println();
//		System.out.println("新数组："+Arrays.toString(a));
//		System.out.println();
		
		int temp2=a[a.length-1];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
				p2=i;
			}
			
		}
//		System.out.println("min="+min+" p2="+p2);
//		
		a[a.length-1]=min;
		a[p2]=temp2;
		System.out.println("新数组："+Arrays.toString(a));
	}
	//将数组排序，并向其中添加一个数字，并将添加的数字插入到数组合适的位置
	static void T10(){
		Scanner sc=new Scanner(System.in);
		int a[]={53,4,6,3,8,2,8};
		System.out.println("原来的数组：	 "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("排序后的数组："+Arrays.toString(a));
		System.out.println("插入一个数字：");
		int n=sc.nextInt();
		int b[]=new int[a.length+1];
		int i=0;
		for(int j=0;j<b.length;j++){
			if(n>=a[i]){
				b[j]=a[i];
				i++;
			}
		}
		//System.out.println(Arrays.toString(b)+" "+i);
		b[i]=n;
		//System.out.println(Arrays.toString(b)+" "+i);
		for(int j=i+1;j<b.length;j++,i++){
			b[j]=a[i];
		}
		System.out.println("插入后的数组："+Arrays.toString(b));
		
	}
	
	static int seque(int a,int b){
		return a*b;
	}

}
