package com.sample.basics;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateAndTimeExample {
	
public static void main(String[] args) {
	
	
	LocalDate date  = LocalDate.now();
	LocalTime time = LocalTime.now();
	int day = LocalDate.now().getDayOfYear();
	Month locMonth = LocalDate.now().getMonth();
	
	LocalDateTime dateTime = LocalDateTime.now();
	Month month = dateTime.getMonth();
	System.out.println(dateTime);
	System.out.println(month);
	System.out.println(date);
	System.out.println(day);
	System.out.println(locMonth);
	
	System.out.println(LocalDate.of(2019, 01, 03));
	System.out.println(LocalTime.of(14,30)+" PM");
	System.out.println(LocalDateTime.of(date, time));
	System.out.println(time);

	
	
	Duration duraion = Duration.ofSeconds(30, 20);
	Duration duraion2 = Duration.between(LocalTime.NOON, LocalTime.MIDNIGHT);
	System.out.println(duraion);
	System.out.println(duraion2);
	
	Period period = Period.of(2019, 01, 05);
	Period periodOfMonths = Period.ofMonths(2);
	Period period1 = Period.between(LocalDate.of(2019, 01, 05), LocalDate.of(2018, 10, 20));
	System.out.println(period);
	System.out.println(periodOfMonths);
	System.out.println(period1);
	
	Instant instant = Instant.now();
	long instant1 = instant.getEpochSecond();
	System.out.println(instant);
	System.out.println(instant1);
	
	
}

}
