package com.neotech.lesson27;

public class Employee {

	double salary;

	void getPaid() {
		System.out.println("The employee salary is: " + salary);
	}

}

class Contractor extends Employee {
	double hourlyRate;

	void getPaid() {
		System.out.println("The constractor houtly rate is: "+salary);
	}
}

