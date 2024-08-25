package com.neotech.lesson37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WorldMap {

	public static void main(String[] args) {

		Map<String, String> europe = new TreeMap<>();
		europe.put("Turkiye", "Ankara");
		europe.put("Italy", "Rome");
		europe.put("Spain", "Madrid");
		europe.put("Greece", "Athens");
		europe.put("France", "Paris");

		System.out.println("Europe --> " + europe);
		System.out.println();

		Map<String, String> africa = new LinkedHashMap<>();
		africa.put("Kenya", "Nairobi");
		africa.put("Gambia", "Banjul");
		africa.put("Senegal", "Dakar");

		System.out.println("Africa --> " + africa);
		System.out.println();

		Map<String, String> asia = new HashMap<>();
		asia.put("Philippines", "Manila");
		asia.put("Bhutan", "Thimpu");
		asia.put("Turkiye", "Ankara");

		System.out.println("Asia --> " + asia);
		System.out.println();

		/* ~~~~~~~~~~~~~ Put the continent all together and get the world ~~~~~~~~~~~~~ */
		List<Map<String, String>> world = new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);

		System.out.println("World --> " + world);

		System.out.println("Size of it --> " + world.size());

		Map<String, String> map2 = world.get(2);
		System.out.println("Get the element with index 2 --> " + map2);
		System.out.println();
		
		/* ~~~~~~~~~~~~~ Iterate the world with advanced loop ~~~~~~~~~~~~~ */
		
		for(Map<String, String> continent : world) {
			System.out.println(continent);
		}
			System.out.println();
			
		/* ~~~~~~~~~~~~~ Iterate the world with advanced loop & KeySet ~~~~~~~~~~~~~ */
			
			for(Map<String, String> continents : world) {
			
			Set<String> countryNames2 = continents.keySet();
			System.out.println(countryNames2);
		}
			System.out.println();
		
		/* ~~~~~~~~~~~~~ To get the elements by one by ~~~~~~~~~~~~~ */
			
			for(Map<String, String> continents1 : world) {
				
			Set<String> countryNames3 = continents1.keySet();
			
			for(String country : countryNames3 ) {
				System.out.println(country);
			}
			System.out.println("-----------");
		}
	}
}

// Note1: Map with print --> curly bracket {}

/* Note2: We can have list of map. And for this one , we use; List<Map>Key, Value >> (name of this) = new ArrayList<>();  */

/* Note4: It will print the maps saperately with curly bracket like how map prints, 
 * but all the curly brackets map will be inside of an square bracket([]) since we put them into an array list. */


// Note5: To iterate the map, we should get what nside of the list. --> Map<String, String>
 
// Note6: We can also write as a map only instead of Map<String, String>, but if we do not specify the type --> Non - Generic

// Note7: If we want to store the maps, they should have same key and value.

/* Note8: When we print the value based on the 
 * 		    --> Set<type of value> name = continent.keySet();
			<-- it will print with square brackets. */

//  Note9: If you print the values with sout --> it will print with curly brackets because we do not convert it to list, we print it as a map.

// Note10: If we want to get the elements by one by, we need to convert map to string and then get the elements from string with loop.


