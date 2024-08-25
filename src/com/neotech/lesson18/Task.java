package com.neotech.lesson18;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// Ask the user: How many rows do you want in the array?
		// Ask the user: How many columns do you want in the array?

		Scanner input = new Scanner(System.in);

		System.out.println("How many rows do you want in the array?");
		int rows = input.nextInt();

		System.out.println("How many columns do you want in the array?");
		int cols = input.nextInt();

		// Create the array (String[][] names)
		String[][] names = new String[rows][cols];

		// Fill the array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print("Enter value for row " + (i + 1) + ", column " + (j + 1) + ": ");
				names[i][j] = input.next();
			}
		}

		// Print the array
		System.out.println("Your 2D array is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}

	}

}
