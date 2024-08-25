package com.neotech.lesson19;

public class ReplaceAll_Method {
	
	public static void main(String[] args) {
		
		String combination = "My phone # is: 469-964-9999";   //Main String and we'll change things over this.
		
		String combination2 = combination.replaceAll("[0-9]", "*");
		System.out.println(combination2);
		
		String combination3 = combination.replaceAll(" ", "");
		System.out.println(combination3);
		
		String combination4 = combination.replaceAll("-", "/");
		System.out.println(combination4);
		
		String combination5 = combination.replaceAll("[a-z]", "~");
		System.out.println(combination5);
		
		String combination6 = combination.replaceAll("[A-Z]", "~");
		System.out.println(combination6);
		
		String combination7 = combination.replaceAll("[a-zA-Z]", "~");
		System.out.println(combination7);
		
		String combination8 = combination.replaceAll("[0-9]", "");					//--> This will remove all numbers.
		System.out.println(combination8);
		
		String combination9 = combination.replaceAll("[0-9a-zA-z]", "~");
		System.out.println(combination9);
		
		String combination10 = combination.replaceAll("[^0-9a-zA-z]", "~");		   //-->  ^ this make the equation opposite. 
		System.out.println(combination10);
			
		
	}
}


/* Note1: We can replace group of things, like range of numbers or letter. */
/* Note2: If you want to remove the things instead of change with something else just use "".*/

/*
 * Input --> String 
 * Output --> Modified string
 * Action --> Replaces occurrences of a substring
 * Use Case --> Modify specific parts of the text
 */
