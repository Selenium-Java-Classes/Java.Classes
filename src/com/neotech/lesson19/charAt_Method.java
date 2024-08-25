package com.neotech.lesson19;

public class charAt_Method {
	
	public static void main(String[] args) {
		
		
		String name = "Alice";
		char firstChar = name.charAt(0); 
		char lastChar = name.charAt(name.length() - 1); 

		System.out.println("The first character is: " + firstChar); 
		System.out.println("The last character is: " + lastChar); 
		
		
		
		
		
		
	}

}

/*  STEPS: 
 * 1) Create a string variable. 
 * 2) Use "charAt(0)" to get the character at index 0 and store it in firstChar.
 * 3) To get the last character, we calculate the index by subtracting 1 from the string's length --> (name.length() - 1).
 * -> This is because the last character's index is one less than the string length. 
 * -> We then use this index with charAt to retrieve the last character and store it in lastChar.
 * 
 * 4) Print the values of firstChar and lastChar.
 */
