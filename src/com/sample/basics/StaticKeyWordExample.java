package com.sample.basics;

public class StaticKeyWordExample {
	
	static int lab1 = 20;
	static int lab2 =10;
	
	static {
		System.out.println("from static block");
		System.out.println("lab1+lab2 :"+ (lab1+lab2));
	}
	public static void staticMethod() {
		System.out.println("from static method");

	}
	
	public static void main(String[] args) {
		staticMethod();
	}

}
