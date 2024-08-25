package com.neotech.lesson17;

public class CalculateWtihReturn {

	void welcome() {
		System.out.println("Welcome to Sinem's Calculator!  >_<");
	}

	int multiply(int a, int b) {
		return a * b;
	}

	double divide(int a, int b) {
		return a / b;
	}

	int add(int a, int b) {
		return a + b;
	}

	int subs(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		CalculateWtihReturn sinem = new CalculateWtihReturn();

		sinem.welcome();
		System.out.println();
		System.out.println("Result: " + sinem.multiply(20, 6));

		System.out.println("Result: " + sinem.divide(424, 3));

		System.out.println("Result: " + sinem.add(87389, 28784));

		System.out.println("Result: " + sinem.subs(29834, 463));

	}

}
