package com.qin.t1;

public class Test {

	public static void main(String[] args) {
		Address a=new Address();
		a.setCountry("中国");
		a.setProvice("辽宁省");
		a.setCity("沈阳市");
		a.setStress("新民街");
		a.setPostNo("003004");
		a.showInfo();
		System.out.println("********************************************************");
		Address a1=new Address("中国","河北省","秦皇岛市","海港区","066004");
		a1.showInfo();

	}

}
