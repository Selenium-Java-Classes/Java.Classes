package com.neotech.lesson19;

public class Equals_Method {

	public static void main(String[] args) {
						
											// EQUALS
		String name1 = "Sinem";
		String name2 = "Sinem";
		String name3 = new String("sinem"); // Creates a new String object

		System.out.println(name1.equals(name2));  
		System.out.println(name1.equals(name3));  
		System.out.println(name2.equals(name3));  
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		/* Note1: It returns TRUE if the content of both objects is EXACTLY THE SAME, considering both the characters and their order.
		 * Note2: It returns FALSE if the content is DIFFERENT or if the otherObj is NOT a String object (due to type mismatch).
		 */
		
											//EQUALS IGNORE CASE
		
		System.out.println();
		
		String name4 = "Sinem";
		String name5 = "siNem";

		System.out.println(name4.equals(name5));     //false because it is "equals method"
		System.out.println(name4.equalsIgnoreCase(name5)); //true because it is "equalsIgnoreCase"
		
		
	}
}

											//DIFFERENCES:

	/*
	* 1) Case Sensitivity: equals --> Case-sensitive / equalsIgnoreCase --> Case-insensitive 
	* 2) Argument Type: quals --> Object / equalsIgnoreCase --> String 
	* 3) Object Type Check: equals --> Yes (returns false for non-String objects) / equalsIgnoreCase --> No (only checks string
	* content)
    */




