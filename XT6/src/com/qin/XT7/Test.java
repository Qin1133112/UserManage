package com.qin.XT7;

public class Test {

	public static void main(String[] args) {
		Vehicle v=new Vehicle("benz","black");
		v.run();
		Vehicle v1=new Vehicle();
		v1.run();
		Car c=new Car("Honda","red",120,6);
		c.run();

	}

}
