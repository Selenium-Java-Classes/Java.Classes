package com.neotech.lesson03;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
		//type casting
		
		//byte --> short --> int --> long --> float --> double ( we had two more char and boolean)
		
		double d1 = 3.7;  // no casting
						// 3.7 is a double and is assigned to a doule variable
		System.out.println(d1);
		
		double d2 = 5;  //casting happened --> we will call it WIDENING --> done automatically
		System.out.println(d2);
		// Since it is a "double" the print is "5.0" instead of "5".
		// You can put small box into big box, it is fine. But when you tryna put big box iinto small box, it'll give an error.
		
		/// int num = 5.5; // we will call it NARROWING
		/// System.out.println(num); ---> compiler error: Type Mismatch --> cannot convert from double to int
		
		//if I do this, I am telling Java, I am sure, I want it to be stored in an int
		int num2 = (int) 6.5;
		System.out.println(num2);
		
		byte b1 = (byte) 4578;
		System.out.println(b1);
		
		// int has 32 bits: 00000100001000000000001
		// byte has 8 bits:                00000001
		
		int num3 = 50;
		byte b2 = (byte) num3;
		System.out.println(b2);
		
		
		//aother narrowing example
		
		long L1 = 17L;
		int number = (int) L1;  //am I loosing data here??
		System.out.println(number);
		
		
		long L2 = 54676782638362876L;
		int number2 = (int) L2;
		System.out.println(number2);
		
		//another widening example
		int  number3 = 250;
		float f1 = (float) number3; //I can add it, but it is not necessary
		
		float f2 = number2;
		 
		System.out.println(f1);
		System.out.println(f2);
		
		/*
		 * Task 1: 
		 * Create an int variable named number1, assign the value of 500.
		 * 
		 * Store/assign number1 into a byte variable named number2.
		 * 
		 * Re-assign the number1 into number2. Print the value of number2. 
		 * Check if it is 500. What if the initial value was 50?
		 */
		
	
	}
}
