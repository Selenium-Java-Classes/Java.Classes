package com.neotech.lesson09;

public class ContunieAndbreak {

	
	public static void main(String[] args) {

		System.out.println("---------Break----------");

		System.out.println("Print numbers from 1 to 10 until 5 is hit");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");
		}

		// next statement

		System.out.println("\n------Continue------");
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		
	}
}
