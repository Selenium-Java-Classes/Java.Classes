package com.neotech.lesson05;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		//Import java ---> Command + Shift + O
		
	 Scanner Sinem = new Scanner(System.in);
	 		
	 		//STRING
	 System.out.println("What is your name:");
	 String name = Sinem.next();
	 System.out.println("Your name is " + name);
	 
	 		// INT
	 System.out.println("How old are you?");
	 int age = Sinem.nextInt();
	 System.out.println("Your age is " + age + ".");
	 
	 		//BOOLEAN
	 System.out.println("Is it raining outside?");
	 boolean isRaining = Sinem.nextBoolean();
	 if (isRaining) {
		 System.out.println("It is raining outside.");
	 }else {
		 System.out.println("It is NOT raining.");
	 }
	 
	 
	 		// DOUBLE 
	 System.out.println("What is your salary?");
	 double salary = Sinem.nextDouble();
	 System.out.println("You are making " + salary);
	 
	 
	}
}
