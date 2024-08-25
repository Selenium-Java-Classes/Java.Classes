package com.neotech.lesson10;

public class SwitchWithMissingBreak {
	public static void main(String[] args) {
		
		
		int number = 5;
		
		switch(number) {
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5"); //if we forget to put break, it will jumps to the 5 since the value is equal to 5.
									 // so, it will print 567&default part
		case 6:
			System.out.println("6");
		case 7:
			System.out.println("7");
		default:
		System.out.println("The number was not 3,4,5,6,7");
		//break;    ----> you do not have to put break after default
		}
		
		//Limitations of switch;
		// 1) You cannot have duplicate cases.
		// 2) You should be careful with breaks.
		// 3) You cannot have logical operators like if-else or any comparing
		// example: We can say --> if (number == 5 || number == 6) but we cannot say case 5||6||7
		// 4) You cannot use double
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
