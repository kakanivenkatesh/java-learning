package com.sample.basics;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class CalendarExample {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString());  //to get the current date and time
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.HOUR, -4);
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.DAY_OF_WEEK, -3);
		
		System.out.println(calendar.getTime());
		calendar.roll(Calendar.HOUR, 4);
		System.out.println(calendar.getTime());
		
		Locale locale = new Locale("English", "IN");
		NumberFormat formatter = NumberFormat.getInstance();
		
		DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(format.format(d));
		System.out.println();
	}
}
