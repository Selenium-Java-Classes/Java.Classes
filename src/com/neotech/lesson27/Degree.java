package com.neotech.lesson27;

						/*Create a class 'Degree' 
						 * having a method 'getPrerequisite' 
						 * that prints "To get a degree you need a high school diploma".	*/

public class Degree {

	public void getPrerequisite() {
		System.out.println("To get a degree you need a high-school diploma.");
	}

}
 

						/* Class 'Degree' has 2 subclasses named 'Bachelors' and Masters’. 
						 * In Masters class override the method 'getPrerequisite’.  */
	class Bachelors extends Degree{
		
	}
	
	class Masters extends Degree{
		public void getPrerequisite() {
			System.out.println("To get a degree you need a high-school diploma.");
		}
	
	
	/* Call the method by creating an object of each of the three classes. */

	}