package com.neotech.lesson05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		//Write a program that asks user to enter first name and 
		// then last name. At the end system should display users's full name
	
	
		Scanner nameAndLastName = new Scanner(System.in);
		
		System.out.println("Please provide your fisrt name:");
		String name = nameAndLastName.next();
		System.out.println("Your name is " + name);
		
		System.out.println("Please provide your last name: ");
		String lastName = nameAndLastName.next();
		System.out.println("Your last name is " + lastName);

	
		System.out.println("Your full name is " + name + " " + lastName);
		
		
		System.out.println("------------------------------");  
		
		System.out.println("Please enter your full name;");
		String fName = nameAndLastName.next();
		String lName = nameAndLastName.next();
		
		System.out.println(fName + " " + lName);
		
		System.out.println("------------------------------");
		
		System.out.println("Please enter your first name, age, and gender");
		String frstName = nameAndLastName.next();
		int age = nameAndLastName.nextInt();
		String gender = nameAndLastName.next();
		
		System.out.println("Name: " + frstName + " Age: " + age + " Gender: " + gender);
	
	}
}
