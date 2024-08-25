package com.neotech.lesson11;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		System.out.println("Hello!! How many numbers would you like? ");
		Scanner scan = new Scanner(System.in);

		int numOfNumber = scan.nextInt();

		for (int i=1; i <= numOfNumber; i++) {
			
			for(int j=0; j <i; j++) {
				System.out.print(i);
		}
		System.out.println();
		}
		
		for(int i=numOfNumber -1; i>0; i--) {
			
			for(int j=0; j<i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}


	}
