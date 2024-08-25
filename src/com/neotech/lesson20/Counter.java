package com.neotech.lesson20;

public class Counter {
	
	
	  public static int objectCount = 0;   // Static variable to keep track of the number of Counter objects created

	  public Counter() {
	   
	    objectCount++;					   // Increment objectCount every time a Counter object is created
	  }

	  public static void displayCount() {
	    System.out.println("Number of Counter objects created: " + objectCount);
	  }
	
	  public static void main(String[] args) {					//Our main method to run the code
		    Counter obj1 = new Counter();
		    Counter obj2 = new Counter();
		    Counter.displayCount(); 	 // Access static method using class name
		  }

}



/*
 * Steps of this example:
 * 
 * Step1: objectCount is a static variable that keeps track of how many Counter objects have been created. 
 * 
 * Step2: Every time a Counter object is created (in the constructor), objectCount is incremented. 
 * 
 * Step3: The displayCount method (static) displays the current count using the class name Counter.
 */


/*
 * Note1: There's only one copy of the information, and it reflects the state of the class as a whole. 
 * Note2: Static variables are used to store data relevant to the entire class, not specific objects. 
 * Note3: You can access static members using the class name directly (StaticVariables). 
 * 			You don't need to create an object to use them. 
 * Note4: Static variables are allocated memory  when the class is loaded, 
 * 			and they persist throughout the program's execution. 
 * 			This makes them suitable for long-lasting information.
 */