package com.sample.designpatterns;

import java.util.Collection;

public interface DAOInterface {
	
	public Collection<Employee> findAllEmployees();

	public void createEmployee(Employee emp);

	public void  delete(Employee emp);
	public Employee findEmployeeById(Employee emp);
	public void update(Employee emp);
}
