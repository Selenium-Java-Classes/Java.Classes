package com.neotech.lesson09;

public class LoopIntro {
	
	public static void main(String[] args) {

		// printing numbers from 1 to 10

		int num = 1;
		while (num <= 10) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println();

		// in this case i know exactly how many times i have to iterate.
		// for such cases, use the for loop.

		// in a for loop we have 3 sections: initialization, condition, and increment
		for (int num2 = 1; num2 <= 10; num2++) {
			System.out.print(num2 + " ");
		}

		// num2 is a local variable so it is created for the loop and can
		// only be used inside the for loop. Java doesn't recognize num2 outside the for
		// loop.
		// System.out.println(num2); //will give compile time error

	}

}
