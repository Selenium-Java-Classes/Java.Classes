package com.neotech.lesson08;

public class DoWhileLoops {
	
	public static void main(String[] args) {
		
		
		

												// While loop:
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
			// if the condition (denklem) is true, go back to executing the body until it becomes false 
			
			
			//num = 1; //(When you try this code with number 1, since the condition is true, it will keep going until 10. 
					  // (When it comes to 10 which is num < 10, since it is false, it will stop. 
			
			do {


				System.out.print(num + " "); // First you should print it
				
				num++; 
				
			} while (num < 10); //Do not forget to use ; after while, when you use the while with do. 
								// Second we will the write the number
		}
		
		
		
		
	}

