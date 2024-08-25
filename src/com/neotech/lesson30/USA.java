package com.neotech.lesson30;

/*Create a class for your country (for example American)*/

public class USA {

	String name;

	public USA(String name) {
		this.name = name;
	}

	public void talk() {
		System.out.println("Hello my name is " + name + "!");
	}

	/* Add a method (only for American people) */
	public void americanPeople() {
		System.out.println("I can talk English.");
	}

}

class Turkiye extends USA{

	public Turkiye(String name) {
		super(name);
		
	}
	
	/* Override the talk method */
	public void talk() {
		System.out.println("Hello my name is " + name + "!");
	}
}
