package com.neotech.lesson03;

public class Divide {
	public static void main(String[] args) {
		
		
		int a = 13;
		int b = 5;
							//INT
		int div = a/b; //since it is "int" after decimal is lost.
		System.out.println("div --> " + div);
		
		
		int reminder = 13 % 5;
		System.out.println("reminder --> " + reminder);
		// How to calculate it?
		// Reminder is --> 2 "decimals are lost." 
		// 2 * 5 = 10 ---> 13 - 10 =3
		
		
						//DOUBLE
		
		double d1 = 13;
		double d2 = 5;
		
		double res = d1/d2;
		System.out.println("res --> " + res);
		
		double car = d1 % d2;
		System.out.println("car --> " + car);
		
		
		
	}

}
