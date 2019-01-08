package com.sample.basics;

public class Encapsulation {
	
	static int employee_id = 12268;
	private int id;
	
	//constructor overloading
	Encapsulation (){
		System.out.println("From default constructor");
	}
	
	Encapsulation (String name){
		System.out.println("From parameterized constructor");
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Overloaded Method
	public String getEmployeeCode(int recordId){
		return "from employee code with one orgs";
	}
	
	public String getEmployeeCode(int recordId, String name){
		return "from employee code with two orgs";
	}
	
	//static method
	public static String  getEmployeeCode(){
		return "From static method";
	}

		
}
