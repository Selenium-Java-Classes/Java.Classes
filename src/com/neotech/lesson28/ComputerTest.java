package com.neotech.lesson28;

public class ComputerTest {

	public static void main(String[] args) {

		/* Create objects of the child classes and store them in an array. */
		Computer[] computers = { new Apple(), new Lenovo(), new HP(), new Dell() };

		/* Loop through each object and execute available methods. */
		for (Computer pc : computers) {
			pc.specs();
			pc.keyboard();
			System.out.println();
		}

		System.out.println("\n   ----- SPECIFIC METHOD * SUBCLASS -----\n   ");
		
		Apple apple = new Apple();
		apple.launchpad();
		System.out.println();
		
		Lenovo lenovo = new Lenovo();
		lenovo.durability();
		System.out.println();
		
		HP hp = new HP();
		hp.heating();
		System.out.println();
		
	}

}
