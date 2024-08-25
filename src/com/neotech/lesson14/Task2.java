package com.neotech.lesson14;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want to store in the array? ");
		int length = scan.nextInt();
		
		int [] nums = new int [length];
		
		 for (int i = 0; i < nums.length; i++) {  //Length of numbers
			 System.out.println("Please enter a number:");
	            nums[i] = scan.nextInt();
	}
		 for (int i = 0; i < nums.length; i++) {  //Numbers in the array
	            System.out.print(nums[i] + " ");
}
}
}