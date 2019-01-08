package com.sample.basics;

public class ThreadExample extends Thread{
	
	@Override
	public void run() {
		System.out.println("from run");
		System.out.println("from :" + Thread.currentThread().getName());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("from :" + Thread.currentThread().getName()+ " I ="+i);
		}
	}
	
	class MyThread implements Runnable{

		@Override
		public void run() {
						System.out.println("from :" + Thread.currentThread().getName());
		}
		
	}
	

}
