package com.neotech.lesson10;

import java.util.Scanner;

public class task2While {

	public static void main(String[] args) {
		
		// Ask the user to enter a positive number and add it to the total
		// He should enter -1 to STOP. -1 will not be added to the total
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int total = 0;
		
		System.out.println("Please enter a positive number! To STOP enter -1.");
		
		num = scan.nextInt();
		
		while (num != -1) {
			
			total += num;
			
			System.out.println("Please enter a positive number! To STOP enter -1.");
			
			num = scan.nextInt();
			
			
			
		}
		
			System.out.println("Total= "+total);
		
		
		
		
	}

}
