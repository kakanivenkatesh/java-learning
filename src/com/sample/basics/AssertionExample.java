package com.sample.basics;

public class AssertionExample {

	public static void main(String[] args) {
		int count = 20;
		assert count > 50 : "Count exceeded";
		System.out.println("Count : "+count);

	}

}
