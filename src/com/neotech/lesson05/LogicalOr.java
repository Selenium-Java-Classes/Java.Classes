package com.neotech.lesson05;

public class LogicalOr {
	
	public static void main(String[] args) {
		
		
		// If a person has kind of allergy, say you have allergies
		// Otherwise say you are healthy
		
		boolean patientHasAllergy = true;
		boolean peanutAllergy = false;
		boolean lactoseAllergy = false;
		boolean beeAllergy = true;
		boolean seafoodAllergy = false;
		
		if(patientHasAllergy && (peanutAllergy || lactoseAllergy || beeAllergy || seafoodAllergy )) {
			System.out.println("You have allergies.");
		} else {
			System.out.println("You are healthy!!");
		}
		
	}

}
