package com.neotech.lesson27;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.salary = 100000;
		emp.getPaid();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Contractor sinem = new Contractor();
		sinem.hourlyRate = 50;
		sinem.getPaid();
		
	}

}
