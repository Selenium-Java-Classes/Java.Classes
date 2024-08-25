package com.neotech.lesson23_2;

import com.neotech.lesson23.USA;

public class Mexico {
	
	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Accessing the variables from within the Mexico ");
		
		System.out.println("\nPublic --> "+us.bestSchool);
		
		//System.out.println("Default --> "+us.state);      <!-- Since it is default, you cannot access it. -->
		
		//System.out.println("Protected --> "+us.mainState);    <!-- Since it is protected, you cannot access it. -->
		
		//System.out.println("Private --> "+us.capitalCity);    <!-- Since it is private, you cannot access it. -->
		
		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	

		us.attendNeotech();
		//us.playNBA();			  <!-- Since it is protected, you cannot access it. -->
		//us.selectPresident();     <!-- Since it is private, you cannot access it. -->
		
	}
	
	
	

}
