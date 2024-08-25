package com.neotech.lesson30;

public class MethodOverloading {

	public void calculateInterest() {

	}

	public void calculateInterest(int a) {

	}
	public void calculateInterest(String a) {

	}

	public void calculateInterest(int a, double b) {

	}
	
	public void calculateInterest(double a, double b) {

	}
	
	public void calculateInterest(double a, int b) {

	}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading(); //Since the methods are NOT static, we need to create an object t use them.
		
		mo.calculateInterest("");  //Even though it is empty, it is String.
		mo.calculateInterest("5"); //Since it is String, line 13 will run.
		mo.calculateInterest(0);   //Since it is int, line 9 will run.
	}
}

//Method signature = method name + parameters
//Access modifier is NOT part of the method signature
//Return type is NOT part of the method signature
//Static || NonStatic is NOT part of the method signature

