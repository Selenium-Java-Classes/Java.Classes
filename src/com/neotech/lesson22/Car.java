package com.neotech.lesson22;

public class Car {

	int year;
	String model;

	public Car(int year, String model) { // <!-- With paramater -->
		year = year;
		model = model;
	}

	public Car() { // <!-- No paramater -->

		System.out.println("The information is not given.");
	}

	public int getYear() {
		return year;
	}

	public String getModel() {
		return model;
	}
}
