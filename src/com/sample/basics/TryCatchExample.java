package com.sample.basics;

public class TryCatchExample {
	
	public static void main(String[] args) {
		
		int val1 =0;
		int val2 =20;
		try {
			int val3= val2/val1;
			System.out.println("from try block");
			
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		}
	}

}
