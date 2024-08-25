package com.neotech.lesson06;

import java.util.Scanner;

public class nextSomething {

	public static void main(String[] args) {
		
					//NOTES
		
		// Let's say --> Scanner input = new Scanner(System.in);
		
		// int num = input.nextInt();
		
		// double num = input.nextDouble();
		
		//boolean b = input.nextBoolean();
		
		//String a = input.next(); --> When you write the code this way, it will print until the first space, NOT ALL WORDS.
		//String a = input.nextLine(); --> When you write the code this way, it will print ALL WORDS.
	
		
		
		 Scanner input = new Scanner(System.in);
		
		System.out.println("Pleaase enter a long sentence.");
		String str1 = input.next();  //Reading word
		String str2 = input.next(); //Reading word
		String str3 = input.nextLine(); //Reading sentence
	
	System.out.println("str1 ->" + str1);
	System.out.println("str1 ->" + str2);
	System.out.println("str1 ->" + str3);
	
	
	
	
	
	}
}
