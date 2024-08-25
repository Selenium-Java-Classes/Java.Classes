package com.neotech.lesson13;

import java.util.Arrays;

public class IntroOfArrays {
	
	
	public static void main(String[] args) {

		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		System.out.println(Arrays.toString(grades));

		// how do i get the values of the array?

		// 1st way
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + ", ");
		}

		System.out.println();
		System.out.println("---------------");

		// 2nd way: enhanced for loop
		for (char grade : grades) {
			System.out.print(grade + ", ");
		}

		System.out.println();

		String[] fruits = { "Apple", "Orange", "Cherry", "Banana", "Grape" };
		// i want to write the names of the fruits, but if the fruit is orange
		// i want to tell that its my fav fruit

		// 1st way
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].equals("Orange")) {
				System.out.println("Orange is my fav fruit");
			} else {
				System.out.println(fruits[i]);
			}
		}

		System.out.println();
		// 2nd way: enhanced for loop
		for (String fruit : fruits) {
			if (fruit.equals("Orange")) {
				System.out.println("Orange is my fav fruit");
			} else {
				System.out.println(fruit);
			}
		}

		System.out.println();
		// how do i print my array
		System.out.println(Arrays.toString(fruits));
	}

}
