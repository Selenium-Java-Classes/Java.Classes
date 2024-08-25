package com.neotech.lesson35;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Demo {
	public static void main(String[] args) {
		
	
	Set <Integer> numbers = new LinkedHashSet<>();
	
		numbers.add(14);
		numbers.add(8);
		numbers.add(99);
		numbers.add(7);
		numbers.add(4);
		numbers.add(99);
		
		
		System.out.println(numbers);
		System.out.println();
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		int size= numbers.size();
		System.out.println("The size is: " + size);
		System.out.println();
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		System.out.println("\nLoop through the names using for each:");
		for(int number : numbers) {
			System.out.print(number + " | ");
		}
		System.out.println();
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		System.out.println("\nItrator:");
		Iterator <Integer> it = numbers.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		
	}
}

/* Note1: Adding duplicate will be ignored. */

/* Note2: FIFO -> First in - First out --> it will print the order you insert. */

/* Note3: It does NOT allow the --> null element */

/* Note4: Using ".next()" since I only want to use each object only ONCE. */

/* Note5: You can also wirte it like --> Set<String> names = new LinkedHashSet<>();
		* because Set is like the Link, as long as you tell java what kinda set is it will give it to you. */ 








