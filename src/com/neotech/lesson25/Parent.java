package com.neotech.lesson25;

public class Parent {
	
	String name = "Parent Name";
	String lastName = "Parent LastName";
	
	
	void hello() {
		System.out.println("I am the parent class!");
	}
	
}

class Child extends Parent {
	String name = "Child Name";
	
	void hello() {
		System.out.println("I am the child class!");
	}
	
	
	void display() {
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(lastName);
		System.out.println(super.lastName);
		System.out.println(this.lastName);
	}
	
	void sayHello () {
		display();					//Java will add ".this" automatically in front it.
		hello();					//Java will add ".this" automatically in front it.
		super.hello();              //by adding the "super" we are specify the class we'll take (parent)
	
	
	
	}
	
	
}
