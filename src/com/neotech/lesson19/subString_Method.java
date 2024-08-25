package com.neotech.lesson19;

public class subString_Method {

	public static void main(String[] args) {
		
		String message = "Hello gorgeous!!";
		
		String subString = message.substring(0, message.length()/2);

		System.out.println("The substring is: " + subString); 
		
		
		
	}
}




/*  STEPS: 
 * 1) Create a string variable. 
 * 2) Create an object --> String "whatever you want to call it" = "variable name".substring();
 * 3) Print the "whatever you want to call it".
 */