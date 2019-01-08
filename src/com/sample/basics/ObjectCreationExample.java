package com.sample.basics;

public class ObjectCreationExample {

	public static void main(String[] args) {
		String name = new String("Pramati");
		System.out.println("Name :"+ name);
		name =null;
		System.gc();
	}

}
