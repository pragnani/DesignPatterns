package com.patterns.oop;

public class Manager extends Employee {

	public Manager(long id, String name, String email, String password) {
		super(id, name, email, password);
		// TODO Auto-generated constructor stub
	}

	public void manageEmployees() {
		System.out.println("Managing Employees");
	}

	public void attendMeetings() {
		System.out.println("attending Meetings");
	}

	@Override
	public void performDuties() {
		manageEmployees();
		attendMeetings();
		
	}

}
