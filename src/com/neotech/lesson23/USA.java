package com.neotech.lesson23;

public class USA {
	
									//ACCESS MODIFIERS
	
	public String bestSchool = "Neotech";
	String state = "Florida";
	protected String mainState = "New York";
	private String capitalCity = "Washington D.C";
	
	
									//METHODS
	
	public void attendNeotech() {
		System.out.println("NeoTech can be attended froom everywhere!");
	}
	
	protected void playNBA() {
		System.out.println("Only countries in the same package can join NBA!");
	}
	
	private void selectPresident() {
		System.out.println("Only the people in the same country can vote for that country!");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Accessing the VARIABLES from within the USA ");
		
		System.out.println("\nPublic --> "+us.bestSchool);
		
		System.out.println("Default --> "+us.state);
		
		System.out.println("Protected --> "+us.mainState);
		
		System.out.println("Private --> "+us.capitalCity);
		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
		
		System.out.println("\n\nAccessing the METHODS from within the USA \n ");

		us.attendNeotech();
		us.playNBA();
		us.selectPresident();
		
		
		
		
		
	}
}
