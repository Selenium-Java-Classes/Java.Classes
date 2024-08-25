package com.neotech.lesson25;

public class Addition {
	
	
					//Method signiture --> void add (int, int)
	
	void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
					// Method with same name (add) but different signiture (int, int, int).
					// Method overloading by changing the number of parameters.
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
					//Since the signiture is same (int, int), it is not overloading.
	/*
	 * 		void add (int c, int d) { 
	 * 				System.out.println(c+d); 
	 *	    }
	 */
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
					// Method overloading bu changing parameter type. (double, double)
	void add (double a, double b) {
		System.out.println(a+b);
	}
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
	void add (double a, double b, double c){
		System.out.println(a+b+c);
	}
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
					//Since the paramter is different (double, int), it is overloading.
	void add (double d, int i) {
		System.out.println(d+i);
	}
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
					//Since the parameter is (int, double), it is overlaoding. 
					// Order of the parameter is MATTER, so (double, int) and (int, double) are NOT SAME.
	void add (int i, double d) {
		System.out.println(i+d);
	}
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
					// Since the parameter is different (String, int) it is overloading.
	void add (String str, int i) {
		System.out.println("Cannot add them!");
	}
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
					//Since the paramter is different (int, String), it is overloading.
					// Order of the parameter is MATTER, so (double, int) and (int, double) are NOT SAME.
	void add (int i, String str) {
		System.out.println("Cannot add them!!");
	}
	
	
}
