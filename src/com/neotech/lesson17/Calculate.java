package com.neotech.lesson17;

public class Calculate {
	void numbers(int number) {
		System.out.println(number);
		System.out.println(number);
	}

	void operator(String operators) {
		System.out.println(operators);
	}
	public static void result(int num1, int num2, String operator) {
		double result = 0;
		
		switch (operator) {
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		default:
			System.out.println("Invalid operator!!!");
		}
		System.out.print("Result: " + result);
		System.out.println();
	}

	public static void main(String[] args) {
		
		Calculate equation = new Calculate();   		

		result(10, 5, "*");
		result(24, 9, "/");
		result(34, 45, "-");
		result(28763, 847, "+");
	}

	
}