package com.patterns.oop;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	List<Employee> listEmployees=new ArrayList<Employee>();
	
	public void saveEmployee(Employee employee){
		listEmployees.add(employee);
	}
	
	public void deleteEmployee(Employee employee){
		listEmployees.remove(employee);
	}
	
	
	public List<Employee> getAllEmployee(){
		return listEmployees;
	}
	

}
