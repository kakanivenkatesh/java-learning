package com.sample.basics;


public class TestThread {

	public static void main(String[] args) {
		ThreadExample thread = new ThreadExample();
		Thread t = new Thread(thread);
		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);
		
		t.setName("pramati");
		t1.setName("WM");
		t2.setName("Spotcues");
		t.start();
		t1.start();
		t2.start();

	}

}
