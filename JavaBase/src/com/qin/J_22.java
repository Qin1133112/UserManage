package com.qin;

public class J_22 {
	public static void main(String args[]){
		
	}
	static void fun(){
		int a=0,b=0,c=0,d=0,e=0,f=0;
		for(a=0;a<2;a++){
			for(b=0;b<2;b++){
				for(c=0;c<2;c++){
					for(d=0;d<2;d++){
						for(e=0;e<2;e++){
							for(f=0;f<2;f++){
								if(d==0){
									e=0;
									if((a==b||a!=b)&&((a==0&&e!=a&&f!=a)||(e==0&&a!=e&&f!=e)||(f==0&&a!=f&&e!=f)) &&(b==c)&&(a!=d)&&(c!=d)){
										System.out.println("a="+a+"  b="+b+"  c="+c+"  d="+d+"  e="+e+"  f="+f);
									}
								}
							}
						}
					}					
				}
			}
		}
		//System.out.println("a="+a+"  b="+b+"  c="+c+"  d="+d+"  e="+e+"  f="+f);
	}
 }
