package com.neotech.lesson12;

public class Task6Countries {

	public static void main(String[] args) {

		//Create an array of countries. 
		//While retrieving all values from the array print the capital city for each country.
		
		
		String [] countries = {"Turkiye", "Austria", "Germany", "United States" };
		String[] capitals = {"Ankara","Vienna", "Berlin", "Washington, D.C." };
		
		
		
		 for (int i = 0; i < countries.length; i++) {    //Let's say countries and capitals arrays are same length

			
			System.out.println("The capital city of " + countries[i] + " is " + capitals[i]);
			
			
		}
		
		
		
	}

}
