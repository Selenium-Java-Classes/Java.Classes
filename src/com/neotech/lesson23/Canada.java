package com.neotech.lesson23;

public class Canada {
	
	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Accessing the variables from within the USA ");
		
		System.out.println("\nPublic --> "+us.bestSchool);
		
		System.out.println("Default --> "+us.state);
		
		System.out.println("Protected --> "+us.mainState);
		
		//System.out.println("Private --> "+us.capitalCity);    <!-- Since it is private, you cannot access it. -->
		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

		System.out.println("\n\nAccessing the METHODS from within the USA \n ");

		us.attendNeotech();
		us.playNBA();
		//us.selectPresident();     <!-- Since it is private, you cannot access it. -->
		
		
		
	}
}
