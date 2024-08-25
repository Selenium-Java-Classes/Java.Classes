package com.neotech.lesson27;



public class AnimalTest {

	public static void main(String[] args) {
		
		System.out.println("~~~~~~~~~~ANIMAL CLASS~~~~~~~~~~\n");
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		/* animal.run   //-> This method is only on the child class, so you cannot call it.*/
	
	
		System.out.println("\n\n~~~~~~~~~~TIGER CLASS~~~~~~~~~~\n");
		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.sleep();
	
	
		System.out.println("\n\n~~~~~~~~~~POLYMORPHISM~~~~~~~~~~\n");
		Animal tiger1 = new Tiger();
		tiger1.eat();
		tiger1.sleep();
		
		// Note1: It is "Up Casting"
	
	
	}

}
