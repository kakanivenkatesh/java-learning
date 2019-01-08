package com.sample.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateAndReadProperties {
	
	public static void main(String[] args) {
		Properties props = null;
		FileOutputStream outStream =null; 
		FileInputStream inStream= null;
		
		try {
			outStream= new FileOutputStream("application.properties");
			props= new Properties();
			props.put("QB_ID", "Test_id");
			props.put("token", "test_token");
			props.put("filed_id", "206");
			props.store(outStream, "Test properties");
			
			inStream = new FileInputStream("application.properties");
			props.load(inStream);
			
			System.out.println(props.getProperty("QB_ID"));
			System.out.println(props.getProperty("token"));
			System.out.println(props.getProperty("filed_id"));
			

		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				outStream.close();
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
