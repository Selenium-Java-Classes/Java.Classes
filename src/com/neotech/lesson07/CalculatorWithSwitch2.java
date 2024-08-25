package com.neotech.lesson07;

import java.util.Scanner;

public class CalculatorWithSwitch2 {

	public static void main(String[] args) {
		 
		char operator;
		double number1, number2, result;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the first number:");
		number1 = scan.nextDouble();
		
		System.out.println("Enter the second number:");
		number2 = scan.nextDouble();
		
		System.out.println("Enter the operator:");
		operator = scan.next().charAt(0);
		
		
		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println(result);
			break;
		case '-':
			result = number1 - number2;
			System.out.println(result);
			break;
		case '*':
			result = number1 * number2;
			System.out.println(result);
			break;
		case '/':
			result = number1 / number2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid Operator!");
			break;
			
		}
		
		
		
		
		
		
	}
}
