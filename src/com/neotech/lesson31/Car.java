package com.neotech.lesson31;

/*Create a Class Car*/

public class Car {

	/* fields: carPrice and color */

	double carPrice;
	String color;

	public Car(double carPrice, String color) { // Constructor for super keyword.
	
		this.carPrice = carPrice;
		this.color = color;
	}

	/* method calculateSalePrice() which should be returning the price of the car */

	public double calculateSalePrice() {
		return carPrice;
	}

}

								/* Create 2 suclasses: Sedan and Truck. */

/*
 * The Sedan class has field as length also has its own implementation of
 * calculateSalePrice(): if length of sedan is >20 feet then returned car price
 * should include 5% discount, otherwise 10% discount
 */

class Sedan extends Car {

	double length;

	public Sedan(double carPrice, String color, double length) {
		super(carPrice, color);
		this.length = length;
	}

	public double calculateSalePrice() {

		if (length > 20) {
			return carPrice * 0.95; 		// include 5% discount
		} else {
			return carPrice * 0.90; 		// otherwise 10% discount
		}
	}

}

/* The Truck class has a field as weight 
 * has its own implementation of calculateSalePrice() method in which returns the price calculated as following: 
 * if weight>2000 then returned price car should include 10% discount, otherwise 20% discount. */

class Truck extends Car {

	double weight;
	
	public Truck(double carPrice, String color, double weight) {
		super(carPrice, color);
		this.weight = weight;
	}

	public double calculateSalePrice() {
		if (weight > 2000) {
            return carPrice * 0.90;			 // include 10% discount
        } else {
            return carPrice * 0.80; 		// otherwise 20% discount
        }
    }
	
}