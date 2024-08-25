package com.neotech.lesson08;

public class PreAndPostDecrement {

	public static void main(String[] args) {
		
		int a;
		int b = 5;
		
		a = b--;
		System.out.println(a);
		System.out.println(b);
		//If "--" comes right side of the variable, the first value will not change. Second value will be decrease by 1.
		
		System.out.println("------------------------");
		
		
		int c;
		int d = 8;
		
		c = --d;
		System.out.println(c);
		System.out.println(d);
		
		//If "--" comes left side of the variable, both of the value will increase by 1. 

		
		
		
	}
	
	
	
}
