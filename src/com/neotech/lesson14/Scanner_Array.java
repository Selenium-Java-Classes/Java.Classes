package com.neotech.lesson14;

import java.util.Scanner;

public class Scanner_Array {

	
	// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the numbers: Read numbers and enter them into the array
		// Print the numbers from the array

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.println("How many numbers do you want to store in the array?");
			int size = input.nextInt();

			// Declaring the array
			int[] array = new int[size];

			// Read numbers and enter them into the array
			for (int i = 0; i < array.length; i++) {
				System.out.println("Please enter a number:");
				array[i] = input.nextInt();
			}

			// Print the numbers from the array
			for (int num : array) {
				System.out.print(num + " ");
			}

			// Homework-Practice
			// Print the sum of the numbers in the array
			// 1. Using Normal for loop
			// 2. Using Enhanced/advanced or loop

		}
}
