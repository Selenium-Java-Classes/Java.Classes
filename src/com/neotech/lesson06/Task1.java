package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		// Ask the user to enter 2 numbers
		// Ask the user for the operator (+,-,*,/)
		// Solve it using if-else
		
	Scanner sinem = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		double d1 = sinem.nextDouble();
		
		System.out.println("Please enter the second number");
		double d2 = sinem.nextDouble();
		
		System.out.println("Please enter the operator");
		String operator = sinem.next();
		
		double result = 0;
		
		if (operator.equals("+")) {
			result = d1 + d2;
			// System.out.println("The result is " + (d1 + d2));
		} else if (operator.equals("-")) {
			result = d1 - d2;
			// System.out.println("The result is " + (d1 - d2));
		} else if (operator.equals("*")) {
			result = d1 * d2;
			// System.out.println("The result is " + (d1 * d2));
		} else if (operator.equals("/")) {
			result = d1 / d2;
			// System.out.println("The result is " + (d1 / d2));
		} else {
			System.out.println("Invalid operator");
		}
		
		System.out.println("The result is " + result);
		
		
	}
}