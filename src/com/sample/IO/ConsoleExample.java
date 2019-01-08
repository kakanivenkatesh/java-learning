package com.sample.IO;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args) {
		Console console =System.console();
		String userName = console.readLine("Please enter Username :");
		
		char[] pw = console.readPassword("%S", "PWD:");
		System.out.println(userName);
	}
}
