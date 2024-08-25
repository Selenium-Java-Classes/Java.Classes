package com.neotech.lesson06;

import java.util.Scanner;

public class Task2 {

	
	public static void main(String[] args) {
		
		// Ask the user to enter the age
		// If age is 0 --> You are a newborn
		// If age is from 1 to 3 --> You are a baby
		// If age is from 4 to 5 --> You are a toddler
		// If age is from 6 to 12 --> You are a kid
		// If age is from 13 to 19 --> You are a teenager
		// If age >= 20 --> You are an adult
		
		Scanner ages = new Scanner(System.in);
		
		System.out.println("Please enter your age;");
		int age = ages.nextInt();
		
		
		String result = "";
		
		if (age == 0) {
			result = "You are a newborn >_<";
		} else if(age == 1 || age == 2 || age == 3) {
			result = "You are a baby!!";
		} else if (age == 4 || age == 5) {
			result = "You are a toddler!";
		} else if (age >= 6 && age <= 12) {
			result = "You are a kid!";
		} else if (age >= 13 && age <= 19) {
			result = "You are a teenager.";
		} else {
			result = "You are an adult o_o";
		}
		System.out.println(result);
		System.out.println("--------------------------");
		
	//	if(age == 0) {
	//		System.out.println("You are a newborn >_<");
	//	} else if(age == 1 || age == 2 || age == 3) {
	//		System.out.println("You are a baby!!");
	//	} else if (age == 4 || age == 5) {
	//		System.out.println("You are a toddler!");
	//	} else if (age >= 6 && age <= 12) {
	//		System.out.println("You are a kid!");
	//	} else if (age >= 13 && age <= 19) {
	//		System.out.println("You are a teenager.");
	//	} else {
	//		System.out.println("You are an adult o_o");
	//	} 
		
	
	}
}
