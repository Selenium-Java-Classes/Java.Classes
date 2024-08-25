package com.neotech.lesson04;

public class ElseIfConditionn {
	
	public static void main(String[] args) {
		

		// d1 might be larger than d2
		// d2 might be larger than d1
		// d1 and d2 are equal
		
		double d1 = 35.5;
		double d2 = 39.8;
		
		
		if (d1 > d2)
		{
			System.out.println("number " + d1 + " is larger than " + d2);
		} else if (d1 < d2) {
			System.out.println("number " + d2 + " is larger than " + d1);
		} else {
			System.out.println("number " + d1 + " is equal to " + d2);
		}
		
		
	}

}
