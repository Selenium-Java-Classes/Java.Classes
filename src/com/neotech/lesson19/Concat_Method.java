package com.neotech.lesson19;

public class Concat_Method {
	
	public static void main(String[] args) {
		
		String message = "Hello";
		String greeting = message.concat(" World!");  	  //You should connect the other object to main string.

		System.out.println(message);  					// Original string remains unchanged
		System.out.println(greeting); 				   // New string with concatenation

		
	}

}
