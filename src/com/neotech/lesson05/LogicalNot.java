package com.neotech.lesson05;

public class LogicalNot {

	public static void main(String[] args) {
		
		// ! (NOT) --> It will reserve the value of the boolean
		// != --> Not equal
		
		boolean b1 = !true;   //Not true --> false
		System.out.println(b1);
		
		boolean b2 = !false;   //Not false --> true
		System.out.println(b2);
				
		
		// Negate an expression that produce a boolean
		System.out.println( 6 < 4);
	    System.out.println (!(6 < 4));
		
	    boolean isCold = !true;   //false
	    if (!isCold) {
	    	System.out.println("It's hot!!");
	    }
	    
	    int x = 13;
	    if (x == 12) {    //X is equal (==) to 12.
	    	System.out.println("x is 12");
	    } else {
	    	System.out.println("X is not 12.");
	    }
	    
	    
	    if (x != 12) {     //x is not equal (!=) to 12.
	    	System.out.println("X is Not 12.");
	    }
	    System.out.println(!(x ==12));
 	}
}
