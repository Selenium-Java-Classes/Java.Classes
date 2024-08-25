package com.neotech.lesson19;

public class Trim_Method {

	public static void main(String[] args) {
		
		
		String sentence = "  hello world  ";
		String trimmedString = sentence.trim();

		System.out.println("Original: " + sentence);
		System.out.println("Trimmed: " + trimmedString);
		
	}
}
/*
 * Note: It only removes characters from the beginning and end, 
 * NOT whitespace in the middle of the string.
 */
