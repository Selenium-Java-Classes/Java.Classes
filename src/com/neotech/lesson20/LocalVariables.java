package com.neotech.lesson20;

public class LocalVariables {
	
	
	public void calculateArea(int length, int width) {   //Our method
	   
		int area;  // Local variables declared inside the method

	   
	    area = length * width; 	 // Initialize the local variable before using it

	    System.out.println("Area of rectangle: " + area);
	    

	} 
	    
	    public static void main(String[] args) {	//Our main method
			
			LocalVariables obj = new LocalVariables();

		    // Pass values to the method parameters
			
		    int rectangleLength = 5;
		    int rectangleWidth = 3;
		    obj.calculateArea(rectangleLength, rectangleWidth);
	  }
	
}


/* Note1: The variables which are declared INSIDE a method or constructor or blocks. */

/* Note2: They will not work if you trying to use them outside of their method or scope ({}) */

/* Note3: They need to be initialized before use. */

