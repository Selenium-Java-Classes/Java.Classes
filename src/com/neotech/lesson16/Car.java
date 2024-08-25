package com.neotech.lesson16;

public class Car {
	// What features does a car have??
	// make model color year mileage ---> can be represented with a variable

	// what behaviors does a car have??
	// drive(), stop(), transportPeople() ---> can be represented with a method

	String make;
	String model;
	String color;
	int year;
	double mileage;

	// behaviors -- methods
	/// input ----->>> transformation --->>> output
	void drive() {
		System.out.println(make + " " + model + " drives!");
	}

	void stop() {
		System.out.println(make + " stops!");
	}

	void transportPeople() {
		System.out.println(make + " can transport people!");
	}

	// What is a class?
	// a class is a template/blueprint made out of features and behaviors

	// What is an object?
	// an object is an instance/example of a class

	public static void main(String[] args) {

		int a = 5;

		// how do I make use of the template we created???

		// Date Type identifier = value ;
		// ClassName identifier = NEW ClassName();
		Car car1 = new Car(); // I have just created an object!!!!
		// What does this line do?
		// 1. Car car1 ---->>> Declared an object of type Car and names it as car1
		// 2. NEW ---->>> instantiate
		// 3. Car() --->>> initialize

		// Since the object was created with default values, how
		// do I change those???

		car1.make = "BMW";
		car1.model = "M5";
		car1.color = "Red";
		car1.mileage = 15000;
		car1.year = 2021;

		// we can reassign values
		car1.mileage = 20000;

		System.out.println(car1.make + " " + car1.model + " " + car1.color + " " + car1.year + " " + car1.mileage);

		// how do we access the methods
		car1.drive();
		car1.stop();
		car1.transportPeople();
	}

}
