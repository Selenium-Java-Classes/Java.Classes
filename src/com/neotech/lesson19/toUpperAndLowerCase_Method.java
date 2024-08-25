package com.neotech.lesson19;

public class toUpperAndLowerCase_Method {
	
	public static void main(String[] args) {
		
		
								//UpperCase Methos
								
		String text = "Hello, World!";
		String UpperCaseText = text.toUpperCase();

		System.out.println(text); 			//original string remains unchanged
		System.out.println(UpperCaseText);	//uppercase version
		
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		
								//LowerCase Method
		
		String message = "HELLO, WORLD!";
		String lowerCaseMessage = message.toLowerCase();

		System.out.println(message);  			// original string remains unchanged
		System.out.println(lowerCaseMessage);  // lowercase version
		
	}

}
