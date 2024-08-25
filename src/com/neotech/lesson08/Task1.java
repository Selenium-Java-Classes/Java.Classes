package com.neotech.lesson08;

public class Task1 {

	public static void main(String[] args) {
		
		//How can I print  only even number from 50 to 1?
		
		 int number = 50;
	        
	     while (number >= 1) {
	            
	     if (number % 2 == 0) {
	    	 System.out.println(number);
	     }
	        number--;
	     }
	    	
	     
	     							//OR YOU CAN WRITE THIS WAY;
	     int x = 50;
	     
	     while (x > 1) {
	    	System.out.println(x + " ");
	    	
	    	x = x - 2; 
	      //x -= 2
	     // x--;
	    	
	     }
		
	}
}
