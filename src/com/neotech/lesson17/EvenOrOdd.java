package com.neotech.lesson17;

public class EvenOrOdd {

	// Create a method that will take a number and prints whether the number is even or odd.
	
	
	public static void evenOrOdd(int[][] numbers) {

		for (int[] number : numbers) {
			for (int num : number) {
				if (num % 2 == 0) {
					System.out.println("The " + num + " is even.");
				} else {
					System.out.println("The " + num + " is odd!");
				}

			}

		}
	}

	public static void main(String[] args) {
		int[][] numbers = { { 36, 948, 27 }, { 736, 43, 59 }, { 847, 68, 93 } };
		evenOrOdd(numbers);
	}

}
