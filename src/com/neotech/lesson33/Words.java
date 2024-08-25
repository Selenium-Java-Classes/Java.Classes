package com.neotech.lesson33;

import java.util.ArrayList;
import java.util.Iterator;

/* Create an arrayList of words. Remove every word that ends with “e”. Use iterator*/

public class Words {
	
	public static void main(String[] args) {
		
		ArrayList <String> words = new ArrayList<String>();
		
		words.add("Phone");
		words.add("Waste");
		words.add("Java");
		words.add("SQL");
		words.add("Froze");
		words.add("API");
		words.add("Eagle");
		words.add("Paper");
		words.add("Pen");
		words.add("Mirror");
		words.add("Speed");
		
		Iterator <String> it = words.iterator();
		
		while(it.hasNext()) {
			String word = it.next();
				
				if(word.endsWith("e")) {
					it.remove();
				
				}
		}
		
		System.out.println(words);
	}

}
