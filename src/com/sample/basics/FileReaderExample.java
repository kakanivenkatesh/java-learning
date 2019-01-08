package com.sample.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class FileReaderExample {
	
	public static void main(String[] args) throws IOException {
		
		char[] in =new char[20];
		
		File file = new File("file.txt");
		boolean fileExists=file.exists();
		boolean fineRenamed = file.renameTo(new File("newfile.txt"));
		
		FileWriter writer = new FileWriter(file);
		writer.write("Pramati Technologies");
		writer.close();
		
		FileReader reader = new FileReader(file);
		reader.read(in);
		for (char c : in) {
			System.out.print(c);
			
		}
		
		
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String data = bufferreader.readLine();
		System.out.println();
		System.out.println("From BufferReader: "+data);
		
		
		File file2 = new File("bufferwriter.txt");
		BufferedWriter brwritter = new BufferedWriter(new FileWriter(file2));
		brwritter.write("Pramati Technologies");
		
		
		PrintWriter pr = new PrintWriter(new FileWriter(file2));
		pr.println("test");
		pr.println("test2");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*			boolean newFile=false;
	char[] in =new char[50];
	
	File file = new File("file.txt");
	FileWriter writer = null;
	BufferedReader br; 
	FileReader reader = null;
	try {
		
		System.out.println(file.exists());
		newFile=file.createNewFile();
		System.out.println(file.exists());
		
		writer = new FileWriter(file);
		writer.write("hello\nPramati Technologies.I am happy to work here");
		writer.flush();
		
		reader = new FileReader(file);
		reader.read(in);
		for (char c : in) {
			System.out.print(c);
			
		}
		
		br = new BufferedReader(reader);
		String data = br.readLine();
		System.out.println("BufferReader : "+data);

	FileReader reader1 = new FileReader(file);
	BufferedReader br = new BufferedReader(reader1);
	String data = br.readLine();
	System.out.println(data);
	
	File file1 = new File("file1.txt");
	FileWriter writer1 = new FileWriter(file1);
	PrintWriter pr = new PrintWriter(writer1);
	pr.println("test");
	pr.println("test2");
	System.out.println("Printwriter : "+pr);
	
		
	} catch (Exception e) {
		
	}
	finally {
		writer.close();
		reader.close();
	}*/
	}
}
