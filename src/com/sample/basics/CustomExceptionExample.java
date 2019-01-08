package com.sample.basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomExceptionExample {
	
	public static void main(String[] args) throws IncorrectFileNameException {
		File file = null;
		try {
		 file= new File("E:/Practice/JavaBasics/temp1");
		Scanner scanner = new Scanner(file);
		if(scanner.hasNextLine()){
			System.out.println(scanner.nextLine());
			
		}
		
		} catch (FileNotFoundException error) {
			
			throw new IncorrectFileNameException("File exception :"+file, error);
		}
		
	}

}
