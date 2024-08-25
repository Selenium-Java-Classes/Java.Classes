package com.neotech.lesson06;

public class Recap {
  
	
		//ALWAYS format your code
		//Command / Control + Shift + F
	public static void main(String[] args) {

		
		//Declare a variable
		String firstName; 
		
		//System.out.println("My name is " + firstName); (You cannot print it because initialize is missing.
		
		//Assign a value ( initialize)
		firstName = "Sinem";
		System.out.println("My name is " + firstName);
		
		
		String lastName = "Tok";
		
		int age = 25;
		
		System.out.println(firstName + " " + lastName + " " + age + 3 + ".");
		// When you add number without parenthesis next to age (number), it will write next to the number.
		// When you add number 	WITH parenthesis next to the age(number), it will add your age.
		System.out.println(firstName + " " + lastName + " " + (age + 3) + ".");
		System.out.println(age); //Since you did not change the value, it will print as 25.
	
		
		
		//reassigning new value
		//After 5 years
		age = age + 5; //or age +=5; (short version)
		lastName = "Canpolat";
		System.out.println(firstName + " " + lastName + " is " + age + " years old. ");
	}
}
