package com.neotech.lesson22;

public class CarDemo {

	public static void main(String[] args) {

		Car car1 = new Car(2024, "Corvette Coupe 2LT");
		car1.year = 2024;
		car1.model = "Corvette Coupe 2LT";

		System.out.println(car1.model + " made in " + car1.year);

		Car car2 = new Car();
		car2.model = "Corvette Coupe 1LT";
		car2.year = 2024;
		
		
	}
}
