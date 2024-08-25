package com.neotech.lesson36;

import java.util.HashMap;
import java.util.Map;

public class Map_Demo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Aaron");
		map.put(2, "Sinem");
		map.put(3, "Betul");

		System.out.println(map);
		
		map.put(1, "Geri");
		System.out.println(map);
		
		boolean isEmpty = map.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("The size of the map: " + map.size());
		
		 
	}
}

// Note1: We are using the Key to get the Value --> K:V
// Note2: Key : Value   --> Integer : String  (In this example)
// Note3: Benefit: Instead of loop, we just use key to get certain value.
// Note4: Map is a --> Interface  and has 4 subclasses
// Note5: Collections are different then others --> map.add() ~~> map.put()
// Note6: Key has to be UNIQUE - Value can be DUPLICATE 