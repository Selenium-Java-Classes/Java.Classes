package com.neotech.lesson31;

public class Test_Marks {

	public static void main(String[] args) {
		
		Marks studentA = new StudentA(97, 85, 90);
		System.out.println(studentA.getAverage());
		
		Marks studentB = new StudentB(68, 79, 45, 100);
		System.out.println(studentB.getAverage());
	}
}
