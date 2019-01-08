package com.sample.designpatterns;

public final class ImmutableExample {
	final String name;
	final int empId;
	
	public ImmutableExample(String name, int empid){
		this.name=name;
		this.empId=empid;
	}
	
	public String getname(){
		return name;
	}
	
	public int getEmpID(){
		return empId;
	}

}
