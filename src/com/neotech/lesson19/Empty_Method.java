package com.neotech.lesson19;

import java.util.Scanner;

public class Empty_Method {

	
	public static void main(String[] args) {
		
								//EMPTY METHOD
		
		String name = "";  					// Empty string
		String message = "Hello, World!";

		System.out.println(name.isEmpty()); 
		System.out.println(message.isEmpty());  
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("~~~~~~~~~~~~ WITH SCANNER ~~~~~~~~~~~");
		System.out.println();
		
		
		Scanner scan = new Scanner(System.in);
		String userInput = scan.nextLine();

		if (userInput.isEmpty()) {
		  System.out.println("Please enter some text.");
		} else {
		  System.out.println("You entered: " + userInput);
		}
		
	//Note1: If it's empty (true), we display a message prompting the user to enter some text.
	//Note2: If it's not empty (false), we display a message with the entered text.
		
		
		
	}
}
