package com.neotech.lesson30;

public class Human {

	/* Fields / Variables */
	String name;
	static String planet;

	public Human() {
		// super(); // Even if do not see in the console, it is run the super
		// constractor.
		System.out.println("A human is being created...");
	}

	public Human(String name) {
		this();
		this.name = name;
	}

	/* Behavior / Method */
	public void talk() {
		System.out.println("bla bla bla");
	}
}

class Albanian extends Human {
	
	public Albanian() {
	
	}
	
	public Albanian(String name) {
		super(name);
	}
	
	public void talk() { 
		System.out.println("Une flas shqip. Une quhem " + name );
	}
	
	public void albanianDance() {
		System.out.println("Dancing Valle Kosovare");
	}
}

class Turkish extends Human{

	public Turkish(String name) {
		super(name);
	}
	public void talk() { 
		System.out.println("Ben Turkce konusuyorum. Benim adim " + name );
	}
	
	public void makeBaklava() {
		System.out.println("I am making Baklava");
	}
}





































// Note1: Every class by default extends the Object Class
// Note2: Class variable (static String planet) -> It is not changing by the human, it is same for every human.
// Note3: Instance variable -> It is changing based on the person, so it is instance
// Note4: Constractors for objects, static has NOTHING with objects
// Note5: super and this --> should be on the first line.
// Note6: You can NOT use both super and this under the same method.
// Note7: Albanian class has ONLY default constructor
// Note8: talk method --> Overriding  -- There should be excatly same method more than one 
// Note9: When overriding --> Method signature MUST be the same

