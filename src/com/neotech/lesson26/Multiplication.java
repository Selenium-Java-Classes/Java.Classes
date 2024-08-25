package com.neotech.lesson26;

public class Multiplication {
	
	public static void multiply(int num1, int num2) {
		
		int result = num1 * num2;
		System.out.println(result);
	}
	
	public static void multiply(int num1, int num2, int num3) {
		
		int result = num1 * num2 * num3;
		System.out.println(result);
		
	}
	
	public static void multiply (double d1, double d2) {
		
		double result = d1 * d2;
		System.out.println(result);
	}
	
	
	

	public static void main(String[] args) {			//Since it is static method
		
		Multiplication.multiply(5, 8);					// NO need to create an object
			//OR
		multiply(5, 9);									//Since it is in the same class, you can use it this way as well.
//************************************//
		multiply(2, 3, 4);
//************************************//	
		multiply(19.3, 20.4);
//************************************//
		multiply(6, 14.8);								//Method with two doubles. 6 --> casted to 6.0
	}
	
}





/* Note1: If there are more than one classes that have SAME name, it is overlaoding.*/
/* Note2: Method signiture --> Method name + parameters. */
/* Note3: When class names are same, parameters which is signiture HAS TO be different. */
/* Note4: Do not forget --> Order is matter.*/ 

/* Note5: -> Compile time polymorphism 
 * 		  -> Static binding 
 * 		  -> Method Overloading
 * they all same  */

/*
 * Note6: As long as name same and signiture is different --> Overlaoding.
 * Does not matter if it is private, static etc or not.
 */