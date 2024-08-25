package com.neotech.lesson08;

public class PreAndPostIncrement {
	
	public static void main(String[] args) {
		
		//All the possible combinations; 
		// ++a 
		// --a
		// a++
		// a--
		
		
		int x;
		int y = 20;
	
		x = y++; // This is a post-increment
				//1. Perform the operation --> assign the value of y to x
				//2. Apply the increment --> increase the value of y by 1
		
		//This is how that line would look in two lines of code;
		//x = y;
		//y += 1;
		
		//If "++" comes right side of the variable, the first value will not change and the second value increase by 1
		
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println("--------------------------");
		
		int a;
		int b =10;
		
		a = ++b;
		System.out.println(a);
		System.out.println(b);
		
		//This is how that line would look in two lines of code;
		//b += 1;
		//a = b;
		
		//If "++" comes left side of the variable, both of the values will increase by 1
		
		
	}

}
