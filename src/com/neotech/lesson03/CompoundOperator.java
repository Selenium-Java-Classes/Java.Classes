package com.neotech.lesson03;

public class CompoundOperator {

	public static void main(String[] args) {
		 // aka shorthand operator
		
		int num = 100; // we have a code value nume ----> which it should point to 100
		
		System.out.println(num);
		
		num = 150;			//now num should point to 150;
		
		System.out.println(num);
		
		num = num + 150; //we are reassigning, but this means add 150 to the current value of num
		System.out.println(num);
		
		//we can do this operation in a shortter way --- we call this as compound/shorthand operator.
		
		num += 50;  //num + num + 50;   +=
		System.out.println(num);
		
		//how can I do this: num = num - 100;
		num -= 100; 
		System.out.println(num);
		
		//how about num = num / 5;
		num /= 5;
		System.out.println(num);
		
		//how about num = num * 6;
		num *= 6;
		System.out.println(num);
		
		// how about num = num % 5;
		num %= 5;
		System.out.println(num);
		
	}
}
