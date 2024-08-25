package com.neotech.lesson19;

import java.util.Arrays;

public class Split_Method {
	
	public static void main(String[] args) {
		
		
									//SPLIT
		String sentence = "I miss my friends..";			//Main String and we'll change things over this.
		
		String[] words = sentence.split(" ");
		
		for(String letters : words) {
			System.out.print(letters + "~");
		} 
		
		System.out.println();
		
		System.out.println("-----------------------");
		
		String[] array = sentence.split("e");
		
		for(int i=0; i<array.length; i++) {
		System.out.print(array[i]);					//??
		}
		System.out.println(); 
		
									//LIST SPLIT (REGULAR EXPRESSION/REGEX)
		
		String list = "1)Sinem2)Gary3)Betul4)Max";
		
		String[] names = list.split("[^a-zA-Z]");       //You can use [1234] or [1-4] or [0-9] to remove numbers as well.
		
		for(String name : names) {
			System.out.print(name + "\t");			//a tab -> more than 5 space
		}
		System.out.println();
		
		System.out.println(Arrays.toString(names));    //We splitted the numbers and characters but we can see the indexes of them with it.
	}

}



/* Note1: The syntax of it is: public String[] split(String regex) */
/* Note2: Returns a list containing the individual substrings. */
/* Note3: Splits the string into smaller substrings based on a specified delimiter like a comma, space, etc. */
/* Note4: Escape character for space --> \tab */

/*
 * Input --> String 
 * Output --> List of substrings 
 * Action --> Splits based on a delimiter (comma, semicolon, tabs, pipes etc.) 
 * Use Case --> Break down text into components
 */




