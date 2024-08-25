package com.neotech.lesson06;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		//byte < short < int < long < float < double 
		
		int intNumber = 81;
		
		//widening / implicit casting / automatically
		double doubleNumber = intNumber;
	
		System.out.println("intNumber --> " + intNumber);
		System.out.println("doubleNumber --> " + doubleNumber);
		
		
		
		//narrowing / implicit casting / manually
		byte byteNumber = (byte) intNumber; //It is risky, you MAY lose data because it is narrowing.
		System.out.println("byteNumber --> " + byteNumber);
		
		
		//reassigning
		intNumber = 450;
		// in this case you WILL lose data.
		byte b2 = (byte) intNumber; //When you do it manually "(byte)", that means you take all responsibility.
		System.out.println("b2 --> " + b2); 
		
		
		//widening / implicit casting / automatically
		byte b3 = 50;
		int i3 = b3;
		System.out.println("i3 --> " + b3);
		
		
		
		//narrowing / implicit casting / manually
		double d1 = 7.999;
		int i4 = (int) d1;
		System.out.println("i4 --> " + i4);
	}

}
