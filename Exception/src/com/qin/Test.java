package com.qin;

public class Test {

	public static <thows> void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i=0;
		double sum=0;
		//MyException e=new MyException();
		for (i = 10; i >= -1; i--) {
			if(i>0){
				sum = sum + i;
				System.out.println(sum);
			}
			else{
				MyException e=new MyException();
				e.
			}
			
		}*/
		String s=null;
		String s1="kdkss";
		try{
			if(s!=null&&s1!=null){
				System.out.println(s);
			}
			else{
				thows NullPointerException;
			}
			
			
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("ø’÷∏’Î“Ï≥£");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("ø’÷∏’Î“Ï≥£");
		}
		finally{
			System.out.println("≤‚ ‘Ω· ¯");
		}
	}

}
