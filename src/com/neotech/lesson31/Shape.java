package com.neotech.lesson31;

/*Create an Interface 'Shape'*/

public interface Shape {

	/* undefined methods as calculateArea and calculatePerimeter */
	double claculateArea();

	double calculatePerimeter();

}

/* Create 2 classes Circle that implements functionality defined in the Shape Interface. */

class Circle implements Shape {

	// For circle we need radius;
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double claculateArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * radius * Math.PI;
	}

}

/* Create 2 classes Square that implements functionality defined in the Shape Interface. */

class Square implements Shape{

	//For square we need 4 lengths;
	
	
	private double length;
	
	Square(double length){
		this.length = length;
	}
	
	
	@Override
	public double claculateArea() {
		
		return length * length;
	}

	@Override
	public double calculatePerimeter() {
		
		return 4 * length;
	}
	
}