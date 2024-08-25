package com.neotech.lesson15;

public class Arr {
	public static void main(String[] args) {

		/*
		 * Create a 2D array of integer type with 3 rows and 4 columns and print all
		 * values of the whole array.
		 */

		int[][] rowsAndColumns = { { 17, 25, 36, 84}, 
			   					   { 49, 57, 68, 99 },
								   {29, 103, 479, 203}
		};

									//Nested For-Loop Way
		for (int a = 0; a < rowsAndColumns.length; ++a) {
			for (int b = 0; b < rowsAndColumns[a].length; ++b) {
				System.out.print(rowsAndColumns[a][b]);
				System.out.print(" ");
			}
			System.out.println();
		}

		
		System.out.println("\n---------Second Way----------\n");

									//Advanced Loop
		for (int[] nums : rowsAndColumns) {
			   for (int num : nums) {
	                System.out.print(num + "  ");
				
			}
			System.out.println();
		}
			
	}

}
