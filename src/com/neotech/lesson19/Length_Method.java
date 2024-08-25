package com.neotech.lesson19;

public class Length_Method {

	public static void main(String[] args) {

		String message = "Hello World!";
		
		int stringLength = message.length();
		
		System.out.println("The length of the string is: " + stringLength);

		
		
							//FOR GETTING HALF OF THE WORD/SENTENCE
		String text = "Hi babygirll!!";
				
		int halfOfIt = text.length()/2;
		
		System.out.println("The half of the length of the string is: " + halfOfIt);
	}
}


/*  STEPS: 
 * 1) Create a string variable. 
 * 2) Call the length() method on variable and store the result (number of characters) in the int variable. 
 * 3) Print the length of the string using System.out.println().
 */

