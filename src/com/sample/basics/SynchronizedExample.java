package com.sample.basics;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedExample {
	
	int count =20;
	
	void getCount(){
		synchronized (this) {
			this.count = this.count+1;
		}
	}
	
	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(20);
		int val = ai.get();
		System.out.println(val);
		
		int expectedval = 20;
		int newVal = 10;
		
		System.out.println(ai.compareAndSet(expectedval, newVal));
		System.out.println(ai);
		
		val = ai.getAndAdd(10);
		System.out.println("ai :"+ai+"  val : "+val);
		
	}
}
