package com.qin.t8;

public class BankAcount {
	private String bankName;
	private float left;
	public BankAcount(String bankName,float left){
		this.bankName=bankName;
		this.left=left;
	}
	
	public void show(){
		System.out.println(bankName+"账户的余额为："+left+"元");
	}
}
