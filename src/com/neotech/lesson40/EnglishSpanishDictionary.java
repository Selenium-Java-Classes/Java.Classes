package com.neotech.lesson40;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EnglishSpanishDictionary {

	public static void main(String[] args) {

		Map<String, String> dictionary = new TreeMap<>();

		dictionary.put("hello", "hola");
		dictionary.put("house", "casa");
		dictionary.put("cat", "gato");
		dictionary.put("donkey", "burro");
		dictionary.put("flag", "bandera");
		dictionary.put("banner", "bandera");

		System.out.println("Map --> " + dictionary);

		/* Get Keys and Values with Set and Collection */

		Set<String> englishWords = dictionary.keySet();
		System.out.println("Keys --> " + englishWords);

		Collection<String> spanishWords = dictionary.values();
		System.out.println("Values --> " + spanishWords);

		System.out.println();
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		// Step1: Convert Map to Set
		Set<Entry<String, String>> entries = dictionary.entrySet();

		// Step2: Iterate the Entry with loop
		for (Entry<String, String> pair : entries) {
			System.out.print(pair + " ");
		}

		// Step2.1: We can also get key and value seperatly
		for (Entry<String, String> pairs : entries) {
			String key = pairs.getKey();
			String value = pairs.getValue();

			System.out.println(key + " --> " + value);

		}

		System.out.println();
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		Set<Entry<String, String>> entriess = dictionary.entrySet();

		Iterator<Entry<String, String>> it = entriess.iterator();
		while (it.hasNext()) {
			Entry<String, String> pair = it.next();
			System.out.println(pair);
		}

	}
}

// Note1: Since it is TreeMap it is in alphabetical order. 
// Note2: For getting the only keys --> keySet();
// Note3: For getting the only values --> values();
// Note4: When we convert map to set or collection, the curly bracket will turn into square bracket
// Note5: When you use Entry --> use entrySet();
// Note6: When you are putting Entry in the loop, you should write --> Entry<primitiveType, primitiveType>
// Note7: While you are using Iterator you sould use --> Entry<primitiveType, primitiveType>
