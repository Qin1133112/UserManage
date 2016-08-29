package com.qin.Caledar;
import java.util.Calendar;
public class CalendarT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c=Calendar.getInstance();
		c.set(2011,6,16);
		int year=c.get(Calendar.YEAR);
		System.out.println(year);
	}

}
