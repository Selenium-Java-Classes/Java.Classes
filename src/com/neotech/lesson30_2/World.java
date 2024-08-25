package com.neotech.lesson30_2;

public class World {

	public static void main(String[] args) {

		Human a1 = new Albanian("Tima");
		a1.talk();
		a1.sleep();

		Human t1 = new Turkish("Sinem");
		t1.talk();
		t1.sleep();
	
	}
}

// Note1: Cannot create/instantiate an object of abstract class.  -> Human h1 = new Human("Sinem");
// Note2: up-casting and down-casting can only be done because of inheritance.