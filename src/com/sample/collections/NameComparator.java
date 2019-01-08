package com.sample.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeeInfo>{

		@Override
		public int compare(EmployeeInfo emp1, EmployeeInfo emp2) {
			String name = emp1.getName();
			String nam2 = emp2.getName();
					
			return name.compareTo(nam2);
		}

}
