package com.neotech.lesson03;

public class homeworks02solving {

	public static void main(String[] args) {
		
		/* HOMEWORK DESCRIPTION;
		 * Write a java program to display the area and perimeter of a circle that has a radius of 5. Use pi = 3.
		 * Use scale 1 mile = 1.609344.
		 * Area = pi * radius * radius
		 * Perimeter = 2 * pi * radius 
			 */
		
		// Very usefull formula!!!!
		//|			declaring a variable		|	assigning a value (initialize)	
		//data type			identifier (name) 		assignment operator(=) 		value       ;
		
		double scale = 1.609344;
		double km; //declaring one variable
		double km2, mile, mile2; // declaring multiple variables of the same type
		
		mile = 5;
		km= mile * scale;  // 2*1.609344 (if you write "2" instead of "mile". 
							// When you use "2", it'll be calculate base on 2.
		System.out.println(mile + " mile is " + km  + " kilometers. ");
		
		
		System.out.println("================");
		
		km2 = 60;
		mile2 = km2/scale; 
		
		System.out.println(km2 + " kilometers is " + mile2 + " miles. ");
	}
}
