package com.patterns.oop;

import java.util.List;

public class EmployeeManagement {
	public static void main(String[] args) {
		Employee employee = new Programmar(1l, "Bali", "bali@kick.com", "password");
		Employee employee1 = new Manager(2l, "mithun", "mithun@shortfilm.com", "password");
		EmployeeDao dao = new EmployeeDao();
		dao.saveEmployee(employee);
		dao.saveEmployee(employee1);

		ReportFormattter formatter = new ReportFormattter();
		SoftCompMgmt company= new SoftCompMgmt();

		List<Employee> allEmployee = dao.getAllEmployee();
		for (Employee employ : allEmployee) {
			System.out.println(formatter.formatReport(employ, FormatType.JSON));
			company.performDuties(employ);
			
		}
	}

}
