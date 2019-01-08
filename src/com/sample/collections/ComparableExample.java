package com.sample.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample implements Comparable<ComparableExample>{

	//We will take Employee detail
	private String name;
	private int empid;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	ComparableExample(String name, int id, String email){
		this.email=email;
		this.empid=id;
		this.name=name;
	}
	
	//used to sort details by name
	@Override
	public int compareTo(ComparableExample emp) {
		
		return (this.name.compareTo(emp.name));
		//return this.name. - emp.name;
	}
	
	@Override
	public String toString() {
		
		return "[id="+this.empid +"name="+this.name+"email="+this.email+"]";
	}

	
	public static void main(String[] args) {
		ArrayList<ComparableExample>  list = new ArrayList<ComparableExample>();
		list.add(new ComparableExample("venki", 12268, "test@gmail.com"));
		list.add(new ComparableExample("Krishna", 13035, "test1@gmail.com"));
		list.add(new ComparableExample("Rana", 12172, "test2@gmail.com"));
		
		Collections.sort(list);
		System.out.println("After Sort");
		for (ComparableExample empinfo : list) {
			System.out.println(empinfo);
		}
	}

}
