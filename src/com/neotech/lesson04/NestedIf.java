package com.neotech.lesson04;

public class NestedIf {

	public static void main(String[] args) {
		
							// if it is morning --->Good morning
									// if it is a school day ---> You are at school
									// else (if it not a school day) ---> You are at home
							// else (not morning) ---> Good afternoon
									// if Thursday ---> You are at the movies
									// else ----> You are sleeping
		boolean isMorning = false;
		boolean isSchoolDay = true;
		boolean isThursday = false;
		
		if (isMorning) {
	
			System.out.println("Good Morning!");
			
			if (isSchoolDay){
				System.out.println("You are at school!");
				
			} else { // you are not at school
				System.out.println("You are at home!");
			}
			
		} else { //not morning
			System.out.println("Good Afternoon!");
			
			if (isThursday) {
				System.out.println("You are at the movies!");
				
			} else {
				System.out.println("You are sleeping!");
			}
		}
	}
}
