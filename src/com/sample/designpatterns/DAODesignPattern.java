package com.sample.designpatterns;

public class DAODesignPattern {

	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		//DAOInterface dao = new DAOEample();
		FactoryDesignPattern pattern = new FactoryDesignPatternImpl();
		DAOInterface dao = pattern.createDAO();
		
		emp.setEmployeeID(12268);
		emp.setEmail("test@gamil.com");
		emp.setName("venki");
		
		dao.createEmployee(emp);
		//dao.delete(emp);
		System.out.println(dao.findEmployeeById(emp).getEmail());
	}
	
}
