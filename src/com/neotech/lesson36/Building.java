package com.neotech.lesson36;

import java.util.HashMap;
import java.util.Map;

public class Building {
	
	public static void main(String[] args) {
		
	Map<Integer, String> building = new HashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Apple");
		building.put(3, "Neotech");
		building.put(4, "Dell");
		building.put(5, "HP");
		building.put(6, "Microsoft");
		building.put(5, "Samsung");  //update
		building.put(7, "Neotech"); //new pair (even though the value is the same)
		building.put(2, "Apple");
		
		System.out.println(building);
		
		// - Check how many entries you have?
		System.out.println("We have " + building.size() + " entries!");
		
		// - Update company on a 4th floor

		building.replace(4, "Lenovo");
		//building.put(4, "Lenovo");
		
		System.out.println(building);
		
		// - Remove company on the 3th floor
		building.remove(3);

		System.out.println(building);
		
		//what happens if I say this: 
		building.remove(10);
		
		System.out.println(building);
		
		//above after every operation, I did not make use of the return
		
		System.out.println(building.replace(5, "Apple"));
		
		System.out.println(building);
		
		//how would I make sure to replace
		
		if(building.containsKey(6))
		{
			building.replace(6, "NVidia");
		}
		else
		{
			System.out.println("Nothing to replace!");
		}
		
		System.out.println(building);
	}

}
