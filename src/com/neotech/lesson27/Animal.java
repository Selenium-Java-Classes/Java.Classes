package com.neotech.lesson27;

public class Animal {

	public void eat() {
		System.out.println("All animals eat!");
	}
	
	public void sleep() {
		System.out.println("All animals sleep!");
	}
	
	
	
	/* public void sleep(String str) {}	//-> compile time polymorphism  -- method overloading */
}

	
	class Tiger extends Animal{
		
		public void eat () {
			System.out.println("Tiger eats humans!");
		}
		
		public void run() {
			System.out.println("Tiger runs very fast!");
		}
		
		
	}



// Note1: Animal class has ---> eat and sleep
// Note2: Tiger class has ---> eat and run. Eat method is overloading.