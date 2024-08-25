package com.neotech.lesson28;

/*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, and Dell.*/
/*Define some common behavior (methods) and some fields in the parent class and override some of the methods in the child classes.*/
/*Define some methods specific to the child classes.*/

public class Computer {

	public void keyboard() {
		System.out.println("Every computer has keyboard!");
	}

	final public void specs() {
		System.out.println("There are some common specifications for all computers.");
	}
}

class Apple extends Computer {

	public void keyboard() {
		System.out.println("It has unique keyboard!");
	}

	public void launchpad() {
		System.out.println("Apple's lauchpad similiar to iPhone's");
	}
}

class Lenovo extends Computer {
	public void keyboard() {
		System.out.println("Lenovo's keyboard is pretty soft.");
	}

	public void durability() {
		System.out.println("Lenovo computers' durabilities are too bad!!");

	}
}

class HP extends Computer {
	public void keyboard() {
		System.out.println("HP has loud keyboard.");
	}

	public void heating() {
		System.out.println("It has heating problem...");
	}
}

class Dell extends Computer {
	public void keyboard() {
		System.out.println("HP and Dell keyboards have same keyboard type.");
	}
}