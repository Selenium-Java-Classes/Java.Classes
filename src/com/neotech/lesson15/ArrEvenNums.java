package com.neotech.lesson15;

public class ArrEvenNums {
	public static void main(String[] args) {

		/*
		 * Create a 2D array or integer type where you will store odd and even numbers
		 * in 3 rows and 4 columns. Develop a program which will identify/print the even
		 * numbers only.
		 */

		int[][] evenAndOdd = { { 2, 7, 4, 73 }, { 9, 6, 34, 8 }, { 62, 89, 27, 56 }

		};
									//Nested For-Loop Way

		System.out.println("Even Numbers: ");
		
		for (int i = 0; i < evenAndOdd.length; i++) {
			
			for (int j = 0; j < evenAndOdd[i].length; j++) {
				
				if (evenAndOdd[i][j] % 2 == 0) {
					
					System.out.print(evenAndOdd[i][j]+" | " );
				}
			}
		}
		
		
		System.out.println("\n\n---------Second Way----------\n");

								//Advanced Loop
		System.out.println("Even Numbers: ");
		
		 for (int[] nums : evenAndOdd) {
			 for (int even : nums) {
				 if (even % 2 == 0) {
	                    System.out.print(even + " | ");
			 }
		 }
	   }
	}
}
