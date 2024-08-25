package com.neotech.lesson35;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<>();
		
		names.add("Sinem");
		names.add("Betul");
		names.add("Ahsen");
		names.add("Ceylin");
		names.add("Emirhan");
		names.add("Keyn");
		names.add("Geri");
		names.add(null);
		names.add("Sinem");
		
		System.out.println(names);
		System.out.println();
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		int size= names.size();
		System.out.println("The size is: " + size);
		System.out.println();
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		System.out.println("\nLoop through the names using for each:");
		for(String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		System.out.println("\nItrator:");
		Iterator <String> it = names.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
	
}


/* Note1: Adding duplicate will be ignored. */

/* Note2: There will be NO order of the list --> random order. */

/* Note3: It allows the --> null element */

/* Note4: Using ".next()" since I only want to use each object only ONCE. */

/* Note5: You can also wirte it like --> Set<String> names = new HashSet<>();
		* because Set is like the Link, as long as you tell java what kinda set is it will give it to you. */ 




