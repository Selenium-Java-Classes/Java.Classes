package com.neotech.lesson26;

// Object class is like Adam and Eve
public class Doctor extends Object { // Every class in Java is extending the Object

	String name;
	int salary;
	String licenceId;

	Doctor() { // Default constructor (That means no parameters)
		super(); // It calls constructor of Object
	}

	Doctor(String name, int salary, String licenceId) {

		this.name = name;
		this.salary = salary;
		this.licenceId = licenceId;

	}

	public void checkUp(String name) {
		System.out.println("Doctor " + this.name + " makes a check up on " + name);
	}

}

class Dermatologist extends Doctor {

	Dermatologist() { // The default constructor is declared implicity by the complier

		// super(); //The default super constructor is being implicity called
	}

}
