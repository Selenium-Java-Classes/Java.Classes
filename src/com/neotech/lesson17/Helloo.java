package com.neotech.lesson17;

public class Helloo {
	/*
	 * Create a method that will say Hello in a different language based on the
	 * country that will passed when method is executed.
	 */

	public static void main(String[] args) {

		String[][] languages = { { "Turkish: ", "Merhaba!" }, { "Albanian: ", "Përshëndetje!" },
								 { "English: ", "Hello!" }, { "German: ", "Hallo!" }, { "Spanish: ", "Hola!" } };
		sayHi(languages);
	}

	public static void sayHi(String[][] languages) {
		for (String[] language : languages) {
			for (String hi : language) {
				System.out.print(hi);
			}
			System.out.println();
		}

	}
}


//int num1 = 98;
//int num2 = 2;
//String [] operators = {"*", "/", "+", "-"};
//
//for(String operator : operators) {
//	double solution = result(num1, num2, operators);
