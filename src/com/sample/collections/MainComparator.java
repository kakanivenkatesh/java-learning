package com.sample.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparator {
	public static void main(String[] args) {
		ArrayList<EmployeeInfo>  emp = new ArrayList<EmployeeInfo>();
		emp.add(new EmployeeInfo("venki", 12268, "test@gmail.com"));
		emp.add(new EmployeeInfo("Krishna", 13035, "test1@gmail.com"));
		emp.add(new EmployeeInfo("Rana", 12172, "test2@gmail.com"));
		
	System.out.println("Before order : ");
	for (EmployeeInfo empinfo : emp) {
		System.out.println(empinfo);
	}
	Collections.sort(emp, new NameComparator());
	
	System.out.println("After NameComparator : ");
	for (EmployeeInfo empinfo : emp) {
		System.out.println(empinfo);
	}
	
Collections.sort(emp, new EmpIdComparator());
	
	System.out.println("After EmpIdComparator : ");
	for (EmployeeInfo empinfo : emp) {
		System.out.println(empinfo);
	}
	}

}
