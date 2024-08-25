package com.neotech.lesson10;

import java.util.Scanner;

public class task2DoWhile {
	
	public static void main(String[] args) {
		
		// Ask the user to enter a positive number and add it to the total
		// He should enter -1 to STOP. -1 will not be added to the total
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int total = 0;
		
		do {
			System.out.println("Please enter a positive number! To STOP enter -1.");
			
			num = scan.nextInt();
			
			if (num != -1) {  //If you do not write if condition,
			total += num; // -1 will be add to the result as well.
			
			}
			
		}while (num !=-1);
		
		System.out.println("Total= "+total);
		
	
	}

}
