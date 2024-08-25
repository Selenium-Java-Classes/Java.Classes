package com.neotech.lesson20;

public class InstanceVariables {
	
	public static void main(String[] args) {

		InstanceVariables obj = new InstanceVariables();
		    obj.calculateArea(5, 3);	
		    
	}
	
	public void calculateArea(int length, int width) {
	  
		int area; 	// --> Local variable declared inside the method
	    area = length * width;
	    System.out.println("Area: " + area);
		
		
		
	}

}



/*
 * Note1: In this example area is a local variable declared inside the calculateArea method. 
 * Note2: It's only accessible within the method and cannot be used in main. 
 * Note3: It needs to be assigned a value (initialized) before using it in the calculation.
 */


/*
 * Note4 : When you call obj.calculateArea(5, 3), you're executing the method,
 * but you're not directly accessing the area variable inside it.
 */

/*
 * Note5: Instance Varibales are exist ONLY as long as the code they are
 * declared in is executing. 

 */

