package com.neotech.lesson11;

import java.util.Scanner;

public class Task3 {

public static void main(String[] args) {
		
		System.out.println("Hello!! How many stars would you like? ");
		Scanner scan = new Scanner(System.in);

		int numOfStar = scan.nextInt();

		for (int i=1; i <= numOfStar; i++) {
			
			for(int j=0; j <i; j++) {
				System.out.print("*");
		}
		System.out.println();
		}
		
		for(int i=numOfStar -1; i>0; i--) {
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


