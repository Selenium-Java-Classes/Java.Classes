package com.neotech.lesson02;

public class VariableDeclarationlesson2 {
	
	public static void main(String[] args) {
		
		// Data type name/identifier = value;
		
		// 1st way if creating variable 
		int number1 = 5; //declare and assign value
		
		//2nd way
		int number2; //declaration
		//Java allows us to declare variable w/out assigning an initial value
		number2 = 10; //assigning a value
		
		
		/* char c1;
		char c2;
		char c3; */
		
		char c1, c2, c3;
		
		c1 = '@';
		c2 = '#';
		c3 = '&';
		
		System.out.println(number2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//value reassignment
		System.out.println(number1);
		
		number1 = 15; //this is value reassignment
		              // after this statement, Java knows that the new value is 15.
		System.out.println(number1); //new value (15) will be printed.
	
		// number1 = "55"; // so this is look like number, it is not. It is a string since number1 is an integer and inside of the quote.
		number1 = 55;
		System.out.println(number1);
		
		// It is printing old number too just because we print it before we change it.
		
		number1 = 40;
		number1 = 100;
		number1 = 500;
		System.out.println(number1);
	}

}
