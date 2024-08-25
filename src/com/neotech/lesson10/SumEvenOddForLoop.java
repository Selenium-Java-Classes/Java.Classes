package com.neotech.lesson10;

public class SumEvenOddForLoop {

	
		// Add Even numbers
		// Also add Odd numbers
		// Also add All numbers
		// Between 1 && 20
		// Using for loop
	
	public static void main(String[] args) {
		
		
		int sumOdd =0;
		int sumEven =0;
		int total = 0;
		
		
		for (int num=1; num <=20; num++) {
			
			if (num %2==0) {
				sumEven += num;
				
			}else {   //odd number
			sumOdd += num;
			
			}
		
			total += num;
		
		}
		System.out.println("The sum if even numbers --> "+ sumEven);
		System.out.println("The sum if odd numbers --> "+ sumOdd);
		System.out.println("The sum if all numbers --> "+ total);
	}
}
