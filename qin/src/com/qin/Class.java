package com.qin;

import java.util.Arrays;


public class Class {

	public static void main(String[] args) {
	/*	int count=0;
		int sum=0;
		for(int i=0;i<=1000;i++){
			sum=sum+i;
			if(i%10==8){
				count++;
			}
		}
		System.out.println("1~1000的总和："+sum);
		System.out.println("以8结尾的个数为:"+count);*/
		//shu1();
		//shu2();
		//shu3();
		//shu4();
		shu5();
		//shu6();
		//shu7();
		//shu8();
		//shu9();
	}
	static void shu1(){
		//int[] c=new int[5];
		int [] c={10,20,30,40,50};
		for(int i=0;i<c.length;i++){
			System.out.println("a["+i+"]="+c[i]+" ");
		}
	}
	static void shu2(){
		int a[]={6,7,8,9,33,344,4};
		int b[] = new int[10];
		System.arraycopy(a, 2, b, 3, 5);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		char [] ch={'n','e','u','s','o','f','t','e','d','u','c','a','t','i','o','n'};
		char []ch1=new char[7];
		System.arraycopy(ch, 0, ch1, 0, 7);
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
	}
	static void shu3(){
		int [] a={1,6,2,3,9,4,5,7,8};
		System.out.print("原来的数组："+Arrays.toString(a));
		System.out.println();
		//Arrays.sort()排序
		Arrays.sort(a);
		System.out.print("Array。sort排序："+Arrays.toString(a));
		System.out.println();
		//排序
		int max[]={a[0]};
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					max[0]=a[i];
					a[i]=a[j];
					a[j]=max[0];
				}
			}
		}
		System.out.print("冒泡排序后："+Arrays.toString(a));
	}
	
	//矩阵相乘
	static void shu4(){
		int a[][]={{2,3,4},{4,6,8}};
		int b[][]={{1,5,2,8},{5,9,10,-3},{2,7,-5,-18}};
		int c[][]=new int[2][4];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b[i].length;j++){
				for(int k=0;k<a[i].length;k++){
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
					//System.out.println("c["+i+"]["+j+"]="+c[i][j]);
				}
				System.out.println("c["+i+"]["+j+"]="+c[i][j]);
			}
			
		}
		
	}
	
	static void shu5(){
		double dou [][]=new double[5][4];
		for(int i=0;i<dou.length;i++){
			for(int j=0;j<dou[0].length;j++){
				System.out.print(dou[i][j]+" ");
			}
			
		}
		
		
	}
	static void shu6(){
		int max=0;
		int [] a={18,25,7,36,13,2,89,63};
		int i=0;
		int xiabiao=0;
		for(i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]<a[j]){
					max=a[j];
					a[j]=a[i];
					a[i]=max;
					xiabiao=j;
				}
				
			}
			System.out.print("最大值："+max+" ");
			
			System.out.print("下标："+xiabiao+" ");
			break;
		}
		//System.out.println(max);
	}
	
	static void shu7(){
		int a[]={1,2,3,4,5,6,7,8,9};
		System.out.print("原来数组："+Arrays.toString(a));
		System.out.println();
		int b[]=new int[9];
		int j=0;
		for(int i=a.length-1;i>=0;i--){
			b[j]=a[i];
			j++;
		}
		System.out.print("逆序数组："+Arrays.toString(b));
	}
	static void shu8(){
		int a[]={3,34,3,7,8,9,4,7,8,32,9,9,9,9,9};
		System.out.print("原数组：");
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+" ");
		}
		System.out.println();
		System.out.print("新数组：");
		int i=0;
		for(i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					a[j]=0;
				}
			}
			System.out.print(a[i]+" ");
		}
		
	}
	
	static void shu9(){
		int a[]={-10,2,3,246,-100,0,5};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int max=a[a.length-1];
		int min=a[0];
		double sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		System.out.println("数组的最大值为："+max);
		System.out.println("数组的最小值为："+min);
		System.out.println("数组的平均值为："+avg);
	}

}
