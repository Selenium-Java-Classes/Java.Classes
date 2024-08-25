package com.neotech.lesson13;

public class Task1Animals {

	//Create an array of animals and store 6 elements into it. 
	//Using 2 different loops print all the elements from the array.
	
	public static void main(String[] args) {
		
			String[] animals = {"Dog","Cat","Horse","Mouse","Bear","Squirrel"};
        
        						// For loop
        System.out.println("With for loop:");
        for(int i = 0; i < 6; i++) {
            System.out.print(animals[i]+" ");
        }
       
        						// Advanced for loop 
        System.out.println();
        System.out.println("\nWith advanced for loop:");
        for(String animal : animals) {
            System.out.print(animal+" ");
        }
		
		
		
	}
}
