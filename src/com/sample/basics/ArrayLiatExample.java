package com.sample.basics;

import java.util.ArrayList;

public class ArrayLiatExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Pramati");
		list.add(1, "Service");
		list.add(2, "Manipulate");
		
		for (String string : list) {
			
			System.out.println(string);
		}
	}

}
