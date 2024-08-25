package com.neotech.lesson31;

public class Test_Shape {
	
	public static void main(String[] args) {
		
		System.out.println("Circle: ");
		
		Shape circle = new Circle(14);
		
		System.out.println("Area ---> " + circle.claculateArea());
		System.out.println("Perimeter ---> " + circle.calculatePerimeter());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("Square: ");
		Shape square = new Square(25);
		
		System.out.println("Area ---> " + square.claculateArea());
		System.out.println("Perimeter ---> " + square.calculatePerimeter());
	}

}
