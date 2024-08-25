package com.neotech.lesson19;

import java.util.Arrays;

public class toCharArray_Method {

	public static void main(String[] args) {

		String sentence = "I'm having so much fun with Java!!!";				//Main String and we'll change things over this.

		char[] charArray = sentence.toCharArray();
		for (char c : charArray) {
			System.out.print(c + " | ");
		}

		System.out.println();

		System.out.println(Arrays.toString(charArray));

		System.out.println("The sentence length is: " + sentence.length());
		System.out.println("The array length is: " + charArray.length);
		System.out.println();
		System.out.println();

		System.out.println("~~~~~~~~~Example~~~~~~~~");
				// Reversed the whole sentence;

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
			
		}
		System.out.println();
		
				//Reversed only the words;
		String sentence2 = "I love learning Java!!";							//I change the String, used another String.
		
		String[] words = sentence2.split(" ");
		for(String word : words) {
			
			char[] fullSentence = word.toCharArray();
				for(int i = fullSentence.length-1; i>= 0; i--) {
					
					System.out.print(fullSentence[i]);
			
		  }
		
	   }
	}
		
}

//}

/* Note1: The syntax of this method: public char[] toCharArray() */
/* Note2: Splits it up into an array of chars. */
/* Note3: Not just one letter, completly array of chars. */
/* Note4: This is gives us array of characters. */