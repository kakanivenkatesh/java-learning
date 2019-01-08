package com.sample.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		
		
		
		
/*		boolean newFile=false;
		char[] in =new char[100];
		try {
			File file = new File("file.txt");
			System.out.println(file.exists());
			newFile=file.createNewFile();
			System.out.println(file.exists());
			
			FileWriter writer = new FileWriter(file);
			writer.write("hello\nPramati Technologies.I am happy to work with Pramati");
			writer.flush();
			writer.close();
			
			FileReader reader = new FileReader(file);
			reader.read(in);
			for (char c : in) {
				System.out.print(c);
				reader.close();
			}


		FileReader reader1 = new FileReader(file);
		BufferedReader br = new BufferedReader(reader1);
		String data = br.readLine();
		System.out.println(data);
		
		File file1 = new File("file1.txt");
		FileWriter writer1 = new FileWriter(file1);
		PrintWriter pr = new PrintWriter(writer1);
		pr.println("test");
		pr.println("test2");
		
			
		} catch (Exception e) {
			
		}
		*/
		FileReader reader = null;

	try {
		File mkdir = new File("makdir");
		mkdir.mkdir();
		File newfile = new File(mkdir, "sample_file.txt");
		newfile.createNewFile();
		
		PrintWriter writer = new PrintWriter(newfile);
		writer.println("sample code");
		writer.flush();
		writer.close();
		
		reader = new FileReader(newfile);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println(br.readLine());
		mkdir.delete();
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		reader.close();
	}
	
	
	}
}
