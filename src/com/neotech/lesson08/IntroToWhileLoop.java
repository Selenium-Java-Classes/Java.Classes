package com.neotech.lesson08;

public class IntroToWhileLoop {
	
	public static void main(String[] args) {
		
		
		// Print numbers from 1 to 10
		// To avoid a loop (Infinite-loop) runs forever, we need a control variable
		
		

							//FIRST WAY TO CONTROL
		int num = 1;
		while (num < 15) {
		System.out.println(num);
		num++;  //Control MUST be inside the brackets
		
		}
		
		System.out.println("---------------------------");
		
							//SECOND WAY TO CONTROL
		int num2 = 4;
		while (++num < 15) {
			System.out.println(num);
		}
		
		System.out.println("---------------------------");
		
		
							//THIRD WAY
		int num3 = 8;
		while (num < 15) {
		
			System.out.println(num + " ");
			num++;
		}
		
		
							//IF I WANT THEM IN THE SAME LINE
		int num4 = 7;
		while (++num < 15) {
			System.out.print(num); //Instead of println --> print
		}
			
			
			
			
				
				
			}
			
			
			
		
	}


