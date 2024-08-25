package com.neotech.lesson14;

public class magicDollars {

	public static void main(String[] args) {

		// Silly way
		for (int i = 1; i <= 4; i++) {

			System.out.println("$$$$$");

		}
		System.out.println("------------------");
		// Serious way
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("$");
			}
			System.out.println();   //For loop tamamlaninca alt satira geciyor
		}

	}
}
