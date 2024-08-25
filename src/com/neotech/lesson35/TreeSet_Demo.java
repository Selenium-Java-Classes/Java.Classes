package com.neotech.lesson35;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Demo {
	public static void main(String[] args) {
		
		Set<String> friends = new TreeSet<>();
		friends.add("Ruh hastasi");
		friends.add("Hadi Gidek Osman");
		friends.add("Atarli Genc");
		friends.add("Ingiltere Prensesi");
		friends.add("Yavru Filim");
		friends.add("Gun Isigim");
		friends.add("Deniz Yildizim");
		friends.add("Narsist Mocuk");
		friends.add("Mr. Dolma Parmak Yildiz");
		friends.add("Minik Suratli Japon");
		friends.add("");
		
		System.out.println(friends);
		System.out.println();
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		int size= friends.size();
		System.out.println("The size is: " + size);
		System.out.println();
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		System.out.println("\nLoop through the names using for each:");
		for(String friend : friends) {
			System.out.print(friend + " | ");
		}
		System.out.println();
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		System.out.println("\nItrator:");
		Iterator <String> it = friends.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		
	}
}



/* Note1: Adding duplicate will be ignored. */

/* Note2: It will print them in an ascending order. Like alphabetic order for Sting. */

/* Note3: It does NOT allow the --> null element */

/* Note4: Using ".next()" since I only want to use each object only ONCE. */

/* Note5: You can also wirte it like --> Set<String> names = new TreeSet<>();
		* because Set is like the Link, as long as you tell java what kinda set is it will give it to you. */ 

/* Note6: Even though bull is not accepted, since empty string is different from null --> it will accepted. */

