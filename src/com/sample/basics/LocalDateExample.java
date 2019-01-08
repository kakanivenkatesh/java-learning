package com.sample.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDate date  = LocalDate.now();
		LocalTime time = LocalTime.now();
		Period period = Period.of(2019, 01, 05);
		System.out.println(dateTime);
		System.out.println(LocalDateTime.of(date, time));
		
		System.out.println(date);
		System.out.println(LocalDate.of(2019, 01, 03));
		System.out.println(time);
		System.out.println(LocalTime.of(14,30)+" PM");
		System.out.println(period);
		
		
	}

}
