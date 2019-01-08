package com.sample.basics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("tracker.txt");
		System.out.println(Files.exists(path));
		if(!Files.exists(path)){
			Files.createFile(path);
		}
		System.out.println(Files.exists(path));
		Path source = Paths.get("E:/Practice/JavaBasics/temp1.txt"); 
		Path target = Paths.get("E:/Practice/JavaBasics/temp2.txt");
		
		if(!Files.exists(source)){
			Files.createFile(source);
		}
		if(!Files.exists(target)){
			Files.createFile(target);
		}
		//Files.copy(source, target);
		//Files.move(source, target);
		Files.delete(path);
		Files.deleteIfExists(path);
	
	}

}
