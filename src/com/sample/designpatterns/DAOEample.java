package com.sample.designpatterns;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DAOEample implements DAOInterface{
private static Map<Integer, Employee> empinfo = new HashMap<Integer, Employee>();

@Override
public Collection<Employee> findAllEmployees(){
	return empinfo.values();
}

@Override
public void createEmployee(Employee emp){
	empinfo.put(emp.getEmployeeID(), emp);
}

@Override
public void  delete(Employee emp){
	empinfo.remove(emp.getEmployeeID());
}

@Override
public Employee findEmployeeById(Employee emp){
	return empinfo.get(emp.getEmployeeID());
}

@Override
public void update(Employee emp){
	
}
	
}
