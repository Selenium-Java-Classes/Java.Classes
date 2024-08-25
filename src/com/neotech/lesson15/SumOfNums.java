package com.neotech.lesson15;

public class SumOfNums {

	public static void main(String[] args) {

		/*
		 * Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		 * Print the sum of all numbers.
		 */

		int[][] sumNums = { { 32, 67, 45 }, 
							{ 89, 71, 94 }, 
							{25,79,63} };
							
								//Nested For-Loop Way
		int sum = 0;

		for (int i = 0; i < sumNums.length; i++) {
			for (int j = 0; j < sumNums[i].length; j++) {

				sum += sumNums[i][j];
				// System.out.println(sum + " ");   //--> Progresses by adding numbers (?)

			}
			
		}
		System.out.println("The sum of the numbers: " + sum);
		System.out.println("\n---------Second Way----------\n");
		
								//Advanced/Enhanced For-Loop Way
		
		for (int[] groupOfNums : sumNums) {
			for (int nums : groupOfNums) {
               //sum += nums;   //--> Use it when the code is by itself.
			}
		}
		System.out.println("The sum of the numbers: " + sum);
	}
}
