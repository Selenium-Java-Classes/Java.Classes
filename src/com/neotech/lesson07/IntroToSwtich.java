package com.neotech.lesson07;

public class IntroToSwtich {

	public static void main(String[] args) {
		
				// Given the number 1-7, print out the name of the day
		
		int day = 4;
		
		if(day == 1) {
			System.out.println("Monday");
			
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
			
		}else if (day == 5) {
			System.out.println("Friday");
		}else if (day == 6) {
			System.out.println("Saturday");
		}else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("That is NOT a day");
		}
		
								//SWITCH CASE
		
//		int day = 8;
		
		switch(day){
		
		case 1: // if ( day ==1)
			System.out.println("Monday");
			break;  // Ends the execution if the block.
		case 2:
			System.out.println("Tuesday");
			break; //If you don't put 'break', it will print everything under it.
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default: //Same as block which is 'Case'
			System.out.println("It is NOT a day");
			break;
		
		
		
			
		}
		
	}
}
