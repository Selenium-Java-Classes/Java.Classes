package com.neotech.lesson33;

import java.util.ArrayList;
import java.util.Iterator;


/* Create an arraylist of cars and retrieve all the values using 3 different ways.*/

public class Cars {
	
	public static void main(String[] args) {
		
		ArrayList <String> cars = new ArrayList<String>();
		
		cars.add("Honda");
		cars.add("Cadillac");
		cars.add("Mercedes");
		cars.add("Hundai");
		cars.add("GMC");
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Porshe");
		cars.add("Mustang");
		
		/* First way with advancedd-loop */
		
		for(String car : cars) {
			System.out.print(car + " ");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/* Second way with for-loop */
		
		for(int i = 0; i < cars.size(); i++) {
			String car = cars.get(i);
			System.out.print(car + " ");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		

		/* Third way with Iterator */
		
		Iterator <String> it = cars.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		
		
		
	}
}
