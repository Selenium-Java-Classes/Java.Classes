package com.neotech.lesson21;

public class Test_Bora {
	
	public static void main(String[] args) {
	
		Bora b = new Bora();       //--> We created a object to call the class
		
		b.addTwoNumber();			//-> Since no paramaters the parenthesis empty. No return.
		System.out.println();
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		b.addTwoNumberThatIGive(7, 5);		//-> Since there are two paramaters (int a, int b) the parenthesis wants two numbers. No return.
		System.out.println();
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		int result1 = b.addTwoNumberAndGiveMeTheResult(); 	//-> Since no paramaters the parenthesis empty.
		System.out.println(result1);
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		int result2 = b.addTwoNumbersThatIGiveAndGiveMeTheResult(13, 2);
		if(result2 == 14) {
			System.out.println("GOOD JOB BORA!!");
		}else {
			System.out.println("I still love you!");
		}
		//I can directly print the result/return of the method;
		System.out.println(b.addTwoNumbersThatIGiveAndGiveMeTheResult(4, 7));
	}
}
