package com.sample.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ResourceBundleExample {
	
	public static void main(String[] args) {
		/*Locale locale = new Locale("en", "IN");
		ResourceBundle resource = ResourceBundle.getBundle("LabelsBundle", locale);*/
		FileInputStream fis;
		try {
			fis = new FileInputStream("LabelsBundle.properties");
			ResourceBundle resource;
			resource = new PropertyResourceBundle(fis);
			System.out.println(resource.getString("s1"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
