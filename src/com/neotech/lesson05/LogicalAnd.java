package com.neotech.lesson05;

public class LogicalAnd {
	
	public static void main(String[] args) {
		
		// Declare an integer 
		// If the number is between 1 and 10 --> small number
		// If the number is between 11 and 100 --> medium number
		// If the number is between 101 and 1000 --> big number
		// If the number is greater than 1000 --> out of range
		
		
		int number = 10001;
		
		if (number >= 1 && number <= 10) {
			System.out.println("This is a small number.");
		} else if (number >= 11 && number <=100) {
			System.out.println("This is a medium number.");
			
		} else if (number >= 101 && number <= 1000) {
			System.out.println("This is a big number.");
		} else {
			System.out.println("Out of range.");
		}
		
		//Let's use a string in out condition block
		
		String name = "John";
		int age = 26;
		boolean isMale = true;
		
		if(name == "John" && age == 29 && isMale) {
			System.out.println("I found you!");
		} else {
			System.out.println("Wrong person!");
		}
		
	}

}
