package com.neotech.lesson19_2;

public class SummarizeOfStringManipulative {
	
	
//	Recap
//
//	Methods:
//		With parameters
//		With no parameters
//
//	Parameter and argument
//
//	int sum(int a, int b) { // a and b are parameters
//		return a + b;
//	}
//
//	sum(5,2);   // 5 and 2 are the arguments
//	sum(6,4);   // 6 and 4 are the arguments
//
//	Methods:
//		Methods that return a value --> we want a result back
//		Methods that don't return a value --> we don't want anything back
//
//	To execute a method:
//		1. Create an object of the class that contains the method
//		2. Then call the method using the object and passing the necessary arguments (if any)
//
//	To create a method with return
//		- Specify the return type at the header of the method
//		- Return the result using the "return" keyword
//
//	int sum(int a, int b) { // return type "int" means that we have to put an integer at the return keyword
//		return a + b;
//	}
//	--------------------------------
//	String -- Non-primitive data type -- a class
//
//	Two ways to create a String
//		1. String literal
//			String name = "James";
//		2. Creating an object
//			String name = new String("Fred");
//
//	What we can do with String methods:
//		- Compare
//		- Verify if a string contains/starts/ends some other text
//		- Get some value characters/SubStrings from a String
//
//	String manipulation methods:
//		- .length() --> gets how many characters are in a String (returns an int)
//		- .toUpperCase() ---> returns the string in UPPERCASE	 (returns a String) 	
//		- .toLowerCase() ---> returns the string in lowercase	 (returns a String)
//		- .isEmpty() ---> checks if the String is empty ("") 	(returns a boolean)
//		- .isBlank() ---> checks if a String only has spaces 
//		- .trim()  ---> remove spaces at the begining and the end of a String (returns a String)
//		- .equals()/.equalsIgnoreCase() ---> checks if two Strings are equal  (boolean)
//		- .contains()  ---> checks if a string contains another string 	(returns a boolean)
//		- .startsWith()/.endsWith() ---> checks if a String starts with or ends with a certain string (boolean)
//		- .concat() ---> joins two string  (returns a String)
//		- .charAt() ---> get a character from a String at a specified index (returns a char)
//		- .indexOf() --> returns the index where a char/string are in a String (returns an int)
//		- .substring() --> returns a part of the String by specifying just begining or begining and ending index (String)
//		- .replaceAll() --> Delete every spaces
//
}
