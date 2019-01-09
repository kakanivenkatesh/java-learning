package com.sample.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/Employee";
	
	 static final String USERNAME = "root";
	   static final String PASSWORD = "root";
	   
	   public static void main(String[] args) {
		
		   Connection conn = null;
		   Statement stmt = null;
		   
		   try{
			      Class.forName(JDBC_DRIVER);

			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USERNAME, PASSWORD);
			      stmt = conn.createStatement();
/*
 				//To create database
			      System.out.println("Creating database");
			      String sql = "CREATE DATABASE IF NOT EXISTS EMPLOYEE";
			      stmt.executeUpdate(sql);
			      System.out.println("Database created successfully");*/
			      
/*			      //to crete table
			      String createTable = "CREATE TABLE IF NOT EXISTS USERS" +"(Empid INTEGER not NULL, " +
                  " Name VARCHAR(100), " + 
                  " Email VARCHAR(100), " + 
                  " Location VARCHAR(100), " + 
                  " PRIMARY KEY ( Empid ))";
			      System.out.println("Creating table");
			      stmt.executeUpdate(createTable);
			      System.out.println("Table created");*/
			      
			      System.out.println("Inserting record into table");
			      String insertQuesry = "INSERT INTO USERS "+ "VALUES(12268,'Venkateswarlu','venkateswarlu.kakani@imaginea.com','Hyderabad')";
			      stmt.executeUpdate(insertQuesry);
			      System.out.println("Record inserted successfully");
			      String getEmployeeInfo = "SELECT * FROM USERS WHERE EMPID=12268";
			      ResultSet result = stmt.executeQuery(getEmployeeInfo);
			     while(result.next()){
			    	  System.out.println(result.getString("email"));
 
			      }

			      stmt.close();
			      conn.close();
		   }
		   catch(SQLException se){
			      se.printStackTrace();
			   }catch(Exception e){
			      e.printStackTrace();
			   }
		   
	}
	
}
