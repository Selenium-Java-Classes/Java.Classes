package com.neotech.lesson17;

public class Greeting {

	void turkish() {
		System.out.println("Merhaba!");
	}

	void albanian() {
		System.out.println("Përshëndetje!");
	}

	void german() {
		System.out.println("Holla!");
	}

	void spanish() {
		System.out.println("Hola!");
	}

	public static void main(String[] args) {

		Greeting hi = new Greeting();
		
		hi.turkish();
		hi.albanian();
		hi.german();
		hi.spanish();
	}

}
