package com.neotech.lesson09;

public class ForLoopIntro {
	
	public static void main(String[] args) {

		// for while loop:
		// check the condition first
		// if the condition is false, do not execute the body, just move on
		// if the condition is true, keep executing the body, until the condition
		// becomes false

		int num = 10;

		while (num < 15) {
			System.out.print(num + " ");
			num++;
		}

		System.out.println();

		// Do While Loop:
		// first execute the body ONCE, then check the condition
		// if the condition is false, do not execute the body anymore, just move on
		// if the conditon is true, go back to executing the body until it becomes false
		
		
		//num = 1;
		
		do {

			System.out.print(num + " ");
			
			num++;
			
		} while (num < 10);

	}

}
