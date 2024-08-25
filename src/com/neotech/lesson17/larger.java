package com.neotech.lesson17;

public class larger {
	
	//Create a method that will take 2 parameters as numbers and prints which number is larger.

	public static void numbers (int number1, int number2) {
		if (number1 > number2) {
			System.out.println(number1 + " is larger than " + number2);
		} else if (number2 > number1) {
			System.out.println(number2 + " is larger than " + number1);
		} else {
			System.out.println("Both numbers are equal");
		}
	}
	public static void main(String[] args) {
		int number1 = 784;
		int number2 = 341;
		numbers(number1, number2);

		number1 = 539;
		number2 = 963;
		numbers(number1, number2);

		number1 = 187;
		number2 = 187;
		numbers(number1, number2);
	}

	

}
