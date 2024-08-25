package com.neotech.lesson30_2;

public abstract class Human {
	String name;
	static String planet;
	
	public Human (String name) {
		this.name = name;
	}

	public abstract void talk(); 
	
	public void sleep() {
		System.out.println("Every human sleeps.");
	}
}

class Albanian extends Human {
	
	public Albanian (String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println(name+ " says Pershendetje");
	}
	
	public void albanianDance() {
		System.out.println("Dancing Valle Kosovare");
	}
}


class Turkish extends Human{

	public Turkish(String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println(name+ " says Merhaba ");
	}

	public void makeBaklava() {
		System.out.println("I am making baklava");
	}
}




// Note1: Abstract has No implement method so do NOT use curly brackets.

// Note2: You can have implement and unimplement method under abstract class

// Note3: If you extend the class and if it is abstract, the other class should be abstract as well.

/* If there is a curly bracket --> Normal method
   If there is NO curly brackets, has semicolon --> implement method */

//Abstract --> %50 abstract --> you can use implement method and normal method







