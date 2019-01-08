package com.sample.collections;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<EmployeeInfo>{

	@Override
	public int compare(EmployeeInfo emp1, EmployeeInfo emp2) {
				
		return emp1.getEmpid() - emp2.getEmpid();
	}

}
