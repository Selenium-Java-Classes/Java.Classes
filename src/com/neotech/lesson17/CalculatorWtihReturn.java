package com.neotech.lesson17;

public class CalculatorWtihReturn {

	// Add two numbers

	int add(int a, int b) {
		return a + b;

		// int result = a+b; --> We can also
		// return result; --> use this
	}
	int multiply (int a, int b) {
		return a*b;
	}
	double divide(double a, double b) {
		return a / b;
	}int giveMeSomething() {
		return 10;
	}

	void dontGiveMyAnything() {
		System.out.println("nothing is sent back!");
	}

	// create a method that gets 3 doubles and returns their average
	double average(double a, double b, double c) {
		return (a + b + c) / 3.0;
	}

	// create a method that receives and integer but returns a string
	String returnToString(int a) {
		return ("your number is " + a);
	}
}
