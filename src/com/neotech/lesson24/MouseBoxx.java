package com.neotech.lesson24;

public class MouseBoxx {

	public static void main(String[] args) {

		Mouse1 m1 = new Mouse1();
		m1.setTexture("Glowy");
		

		Mouse2 m2 = new Mouse2();
		m2.setTexture("Matte");

		Mouse3 m3 = new Mouse3();

		m3.setTexture("Shiny");
		m3.connection();
		m3.displayColor();
	}
}
