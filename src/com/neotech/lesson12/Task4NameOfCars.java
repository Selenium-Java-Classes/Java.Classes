package com.neotech.lesson12;

public class Task4NameOfCars {
	
	
	public static void main(String[] args) {
		
	
	//Create an array of cars and store 6 elements into it. 
	//Print all the values from the array.
	
	String[][]cars = {{"Honda", "Toyota", "Cadillac"},
					{"GMC", "Proche","Nissan"}	
	};
			for (int i=0; i< 2; i++) {
					for (int j=0; j<3; j++) {
							System.out.println(cars[i][j]);
					
	
					 }
				}
	
		}
}
