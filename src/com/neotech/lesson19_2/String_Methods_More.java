package com.neotech.lesson19_2;

public class String_Methods_More {
	
	public static void main(String[] args) {

		String name = "Emrah";

		char letter = name.charAt(0);
		System.out.println("Letter: " + letter);

		// indexOf() and lastIndexOf()
		int index = name.indexOf('m');
		// what does it return if the letter is not on the String
		System.out.println("The index of letter m is: " + index);

		String name1 = "Sabah";
		System.out.println("The index of a is: " + name1.indexOf('a'));
		System.out.println("The last index of a is: " + name1.lastIndexOf('a'));

		// same way, I could look for a String (not a letter)
		System.out.println("The index of ab is: " + name1.indexOf("ab"));

	}
}
