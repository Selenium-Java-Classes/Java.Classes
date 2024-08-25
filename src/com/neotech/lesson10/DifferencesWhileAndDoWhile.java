package com.neotech.lesson10;

public class DifferencesWhileAndDoWhile {
	
	public static void main(String[] args) {
		
		boolean hot = true;
		
		while (!hot) {
			
			System.out.println("While loop --> Drink");
						
		}
		
		
		System.out.println("-----------------------");
		
		
		
		do {
			System.out.println("Do-While loop --> Drink");
		} while (!hot);
		
		
	}

}
