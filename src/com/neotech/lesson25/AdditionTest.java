package com.neotech.lesson25;

public class AdditionTest {
	
	public static void main(String[] args) {
		
		Addition obj = new Addition();
		
		
					// Java can tell the based on input what you are using.
					// Java can redirect you the input you are using.
		
		obj.add(4, 5);		// It is (int, int)
		
		obj.add(5, 15);     // I chose (String, int) but since I input (int,int) the Java redirected it.

		obj.add(4, 5, 7);   // I chose (double, double), but since I input (int, int, int) Jave redirected it.
	
		obj.add(5.12, 12.5); //It is (double, double)
		
		obj.add(5.0, 4);	// It is (double, int)
		obj.add(4, 5.0);	// It is (int, double)
		
		obj.add("Sinem", 9);	//It is (String, int)
		obj.add(9,  "Sinem");	//It is (int, String)
		
		
	}

}
