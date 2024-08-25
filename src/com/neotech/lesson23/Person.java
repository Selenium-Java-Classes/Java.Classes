package com.neotech.lesson23;

public class Person {
	
	//Instance Variables: Whenever you create an object all of them has variables.
	
	public String name;
	int age;
	protected int weight;
 
	

	public Person(String pName, int pAge) {		//When you are creating this, you will provide the name and age.	
												//If you have this, you should give the informations in the main method object.						
		name = pName;
		age = pAge;	
	}
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
	public Person() {						//If you want to use default constructer and the constructer you create, you need default one as well.
		
	}
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
	
	
	public void displayInfo() {
		System.out.println("Name: " +name+ " age: "+age+" weight: "+ weight);
	}
	

	
	
	
}
