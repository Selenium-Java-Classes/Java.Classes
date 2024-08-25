package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndCaseTask {

	public static void main(String[] args) {
		
			// Ask user to enter their country and capture it.
			// Once values are captured print which language user speaks.
		
		Scanner scan = new Scanner(System.in);
		
		String country;
		
		System.out.println("What is your country?");
		country = scan.next();
		
		if(country.equals("Turkiye")) {        //It means if(country == Turkiye)
			System.out.println("You speak Turkish.");
		
		} else if (country.equals("Mexico")) {
			System.out.println("You speak Spanish.");
		
		} else if (country.equals("Germany")) {
			System.out.println("You speak German.");
		
		} else {
			System.out.println("I do not know what language you speak.");
		}
		
		
		// Note: you can also write the code with ignore case (country.equalsIgnoreCase("Turkiye));
		
									//SWITCH CASE
		
		switch (country) {
		case "Turkiye": 
			System.out.println("You speak Turkish.");
			break;
		case "Mexico":
			System.out.println("You speak Spanish.");
			break;
		case "Germany":
			System.out.println("You speak German.");
			break;
		default:
			System.out.println("I do not know what language you speak.");
			break;
			
		}
		
		
		
		
		
		
	}
}
