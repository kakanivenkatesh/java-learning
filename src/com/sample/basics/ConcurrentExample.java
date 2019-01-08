package com.sample.basics;

import java.util.Iterator;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ConcurrentExample {
	
	public static void main(String[] args) throws InterruptedException, BrokenBarrierException, TimeoutException {
		
		//Anonymous Inner type
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From Anonymous run method");
				
			}
		};
		
		
		CopyOnWriteArrayList  list = new CopyOnWriteArrayList<>();
		list.add("Venki");
		list.add(12268);
		list.add("test@gmail.com");
		
		Iterator iterator = list.iterator();
		
		while (iterator.hasNext()){
			System.out.println(iterator.next());
			
		}
		
		CyclicBarrier cbarrier = new CyclicBarrier(2);
		//cbarrier.await();
		cbarrier.await(10, TimeUnit.SECONDS);
		
		

	}
}
