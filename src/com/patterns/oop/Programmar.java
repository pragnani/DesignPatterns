package com.patterns.oop;

public class Programmar extends Employee {

	public Programmar(long id, String name, String email, String password) {
		super(id, name, email, password);
		// TODO Auto-generated constructor stub
	}
	
	public void checkInCode() {
		System.out.println("Checking in Code");
	}

	public void doDevelopment() {
		System.out.println("Doing development");
	}

	public void writeUnitTest() {
		System.out.println("writing Unit Tests");
	}

	@Override
	public void performDuties() {
		checkInCode();
		doDevelopment();
		writeUnitTest();
		
	}

}
