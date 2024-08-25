package com.neotech.lesson19;

public class Explanation_of_String_Methods {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Extracting Information:
		 * 
		 * -> length(): Returns the number of characters in the string. 
		 * -> charAt(int index): Returns the character at the specified index position in the string.
		 * -> substring(int startIndex, int endIndex): Extracts a substring from the string between the given start (inclusive) and end (exclusive) indexes. 
		 * 
		 * 
		 * 2. Searching and Comparing:
		 * 
		 * -> indexOf(String str): Returns the index of the first occurrence of the specified substring within the string, or -1 if not found. 
		 * -> lastIndexOf(String str): Returns the index of the last occurrence of the specified substring within the string, or -1 if not found. 
		 * -> equals(Object otherObj): Compares the string with another object (usually another String) for equality.
		 * -> equalsIgnoreCase(String anotherString): Compares the string with another string ignoring case sensitivity. 
		 * 
		 * 
		 * 
		 * 3. Modifying Strings (Limited):
		 * 
		 * -> concat(String str): Returns a new string that is the concatenation of the current string and the specified string. 
		 * (Note: This doesn't modify the original string as Java Strings are immutable) 
		 * -> replace(char oldChar, char newChar): Returns a new string where all occurrences of a specific character are replaced with another character. 
		 * (Similar to concat, this creates a new String) 
		 * 
		 * 
		 * 4. Other Useful Methods:
		 * 
		 * -> trim(): Returns a new string with leading and trailing whitespace characters removed. 
		 * -> toUpperCase(): Returns a new string with all characters converted to uppercase. 
		 * -> toLowerCase(): Returns a new string with all characters converted to lowercase. 
		 * -> startsWith(String prefix): Checks if the string starts with a given prefix. 
		 * -> endsWith(String suffix): Checks if the string ends with a given suffix. 
		 * -> isEmpty(): Checks if the string is empty (has zero character
		 * 
		 */
	}
	

}


/*
 * Note1: Immutable  --->  Once created, the content cannot be changed. 
 * Note2: Useful when you need data to remain constant.
 */