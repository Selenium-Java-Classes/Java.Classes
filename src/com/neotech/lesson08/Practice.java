package com.neotech.lesson08;

import java.util.Scanner;

public class Practice {
 
	public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 
	 	int variable = 0;
	 	int n;
	 	
	 	// Idea 1: start with 1, while variable <= 5 perform the action and the stop. (++)
	 	// Idea 2: start with 5, while variable > 5 perform the action and stop. (--)
	
		
		
		while(variable <= 5) {
			
			System.out.println("Enter a number: ");
			n = scan.nextInt();
			System.out.println("The number is: " + n);
			
			variable++;
		}
	 
	 
	 
	 
}
}
