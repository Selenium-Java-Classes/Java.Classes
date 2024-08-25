package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your gender (M/F);");
		
		char gender = input.next().charAt(0);
		
		System.out.println("Are you rich? (true/false)");
		boolean rich = input.nextBoolean(); //False or True
		
		if( gender == 'M' || gender == 'm') {
			System.out.println("YAAY! It is a boy!");
			
			if (rich) {
				System.out.println("The boy will live life lol");
			} else {
				System.out.println("Oh noo the boy will be poor...");
			}	
			
		} else if (gender == 'F' || gender == 'f') {
			System.out.println("Awwwee it is a girl!!!");
			if(rich) {
				System.out.println("Have fun with that money gurlll!");
			}else {
				System.out.println("No worries! find a sugar-daddy, honey >_<");
			}
			
		} else {
			System.out.println("Invalid gender.");
		}
			
	}
}
