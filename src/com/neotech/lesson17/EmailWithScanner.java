package com.neotech.lesson17;

import java.util.Scanner;

public class EmailWithScanner {
	/*
	 * Create a method createEmail(). 
	 * Based on provided users firstName, lastName and emailType
	 * Your method should return complete email address. 
	 * Example: firstName -> john lastName -> snow emailType -> gmail return ->johnsnow@gmail.com
	 */
	
	String emailsversions(String firstName, String lastName, String emailType) {
		String mail = firstName + lastName + "@" + emailType + ".com";
		return mail;
	}
	
	 public static void main(String[] args) {
		
		 EmailWithScanner emailGenerator = new EmailWithScanner();

			//Scanner
	        Scanner sinem = new Scanner(System.in);

	        System.out.print("Enter first name: ");
	        String firstName = sinem.nextLine();

	        System.out.print("Enter last name: ");
	        String lastName = sinem.nextLine();

	        System.out.print("Enter email type (gmail, yahoo, hotmail): ");
	        String emailType = sinem.nextLine();
	        
	        String yourEmail = emailGenerator.emailsversions(firstName, lastName, emailType);
			System.out.println("your email is " + yourEmail);


	}
}