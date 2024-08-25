package com.neotech.lesson11;

import java.util.Scanner;

public class Task4 {
	
	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Welcome back! How many stars would you like to use?");
		 
	        int starPyramid = scanner.nextInt();

	        for (int i = 0; i < starPyramid; i++) {
	            // Print spaces
	            for (int j = 0; j < starPyramid - i - 1; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int a = 0; a < i + 1; a++) {
	                System.out.print("* ");
	            }

	            System.out.println();
			
		}
		
		
		
		
	}

}
