package com.sample.basics;

public class ExceptionExample {
	
	public static void main(String[] args) {
		String name = null;

		try {
			if(name.equals("Pramati")){
				System.out.println("both are equal");
			}
			else
				System.out.println("both are not equal");
			
		} catch (Exception e) {
			System.out.println("from catch block");
		}
	}
		
		
}
