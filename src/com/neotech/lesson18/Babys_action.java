package com.neotech.lesson18;

public class Babys_action {

	public static void main(String[] args) {

		// Declaring and initializing a variable
		Baby baby1 = new Baby();
		
		baby1.name = "Bashir";
		baby1.weight = 4;
		baby1.hairColor = "Black";
		baby1.gender = 'M';

		
		System.out.println("The name of baby1 is -> " + baby1.name);
		System.out.println("The hair color of baby1 is -> " + baby1.hairColor);
		System.out.println("The gender of baby1 is -> " + baby1.gender);
		System.out.println("The weight of baby1 is -> " + baby1.weight);
		
		System.out.println("\n-----------------\n");
		
		// Declaring a variable of type baby
		
		Baby baby2;
		
		// Compile-time error, the baby has not be created/initialized
		//System.out.println("The name of the baby is -> " + baby2.name);
		
		
		baby2 = new Baby();
		
		//Since we did not declared the name, it is null.
		//System.out.println("The name of the baby is -> " + baby2.name);
		
		baby2.name = "Umut";
		baby2.gender = 'M';
		baby2.weight = 7;
		baby2.hairColor = "Brown";
		
		System.out.println("The name of baby2 is -> " + baby2.name);
		System.out.println("The hair color of baby2 is -> " + baby2.hairColor);
		System.out.println("The gender of baby2 is -> " + baby2.gender);
		System.out.println("The weight of baby2 is -> " + baby2.weight);

		System.out.println("--------------------------------");

		baby1.cry();
		baby2.cry();
		
		System.out.println("--------------------------------");
		baby1.displayInformation();
		
		System.out.println("--------------------------------");
		baby2.displayInformation();
	

	
	}

}
