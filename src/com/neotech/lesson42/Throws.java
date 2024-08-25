package com.neotech.lesson42;

public class Throws {

	public static void main(String[] args) {
		
		calculator();
		
	}
	
	public static void calculator() {
		
		division(10,2);
		division(9,3);
		division(25,5);
		division(7,0);
		division(14,7);
		
	}
	
	public static void division(int a, int b) throws ArithmeticException {
		
		System.out.println(a/b);
	}
}

// Note1: You use throws keyword next to the method. 

// Note2: Method + throws "Exceptiontype" { 

// Note3: It basically says -> this method throws an exception -> that's why you use next to a method

// Note4: a/b gives an exception because b can be zero --> ArithmeticException

// Note5: It is like taking a precaution -> it might happen so let me throw an exception

// Note6: In this case, Arithmetic Exception is -> Unchecked Exception

/* Note7: When usig methods/actions that can throw exceptions in two ways;
			-> Handle it myself -> try - catch block
			-> Pass it along -> You will pass the throws exception next to the other methods */
	



