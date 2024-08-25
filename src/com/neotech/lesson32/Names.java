package com.neotech.lesson32;

import java.util.ArrayList;

public class Names {
	
	
															//QUESTION

/* 1) Create a generic ArrayList that will store 5 names into it. */
/* 2) Find out whether the given ArrayList is empty or not */
/* 3) Check whether the specific name is present in an ArrayList or not */
/* 4) Find the size of your arrayList */
/* 5) Print all values from that */

															//ANSWER

	public static void main(String[] args) {


		ArrayList<String> namesList = new ArrayList();

		namesList.add("Sinem");
		namesList.add("Ahsen");
		namesList.add("Aaron");
		namesList.add("Adriel");
		namesList.add("Jouse");

		if (!namesList.isEmpty()) {
			

			if (namesList.contains("Aaron")) {
				System.out.println("The name-list is not empty and Aaron is on the list.");

			} else {
				System.out.println("He is not on the list");
			}
		} else {
			System.out.println("The ArrayList is empty");
		}
		

		int nameListSize = namesList.size();
		System.out.println("The size of the name list: " + nameListSize);
		

		System.out.println(namesList);
	}
}
