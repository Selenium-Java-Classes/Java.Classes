package com.neotech.lesson07;

import java.util.Scanner;

public class CalculatorWithSwitch3 {

	public static void main(String[] args) {
		
		char operator;
		double number1, number2, result;
		
		Scanner calculator = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		number1 = calculator.nextDouble();
		
		System.out.println("Please enter the second number:");
		number2 = calculator.nextDouble();
		
		System.out.println("Please enter the operator:");
		operator = calculator.next().charAt(0);
		
		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println(result);
			break;
		case '-':
			result = number1 + number2;
			System.out.println(result);
			break;
		case '*':
			result = number1 * number2;
			System.out.println(result);
			break;
		case '/':
			result= number1 / number2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid Operator!!");
			break;
		}
		
		
		
		
		
		
		
	}
}
