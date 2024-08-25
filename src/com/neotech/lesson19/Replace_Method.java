package com.neotech.lesson19;

public class Replace_Method {
	
	public static void main(String[] args) {

		
		String greeting = "Good Evening!";             //Main String and we'll change things over this.
		
								//Replace single
		
		String newGreeting = greeting.replace('E', 'e');
		
		System.out.println(greeting);
		System.out.println(newGreeting);
		
		String anotherGreeting  = greeting.replace("Evening", "Afternoon");
		System.out.println(anotherGreeting);
		
		System.out.println("----------------------------");
		
								//Replace multiple
		
		
		String multipleGreeting = greeting.replace('G', 'g').replace('o', 'O').replace("n", "N");
		
		System.out.println(multipleGreeting);
		
		
	}

}



/* Note1: Before we replace letter, number, space etc. we should create another String or char. */
/*
 * Input --> String 
 * Output --> Modified string
 * Action --> Replaces occurrences of a substring
 * Use Case --> Modify specific parts of the text
 */


