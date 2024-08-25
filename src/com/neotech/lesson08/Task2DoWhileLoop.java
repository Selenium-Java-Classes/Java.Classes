package com.neotech.lesson08;

public class Task2DoWhileLoop {
	
	public static void main(String[] args) {
	
	
	/*
	 * Create a boolean variable workDay and assign it true create int variable day and
	 * assign it to 1 - As long as it is workDay print "I need a day off" and
	 * increase day. - Once day is 6 print "I do not need a day off any more"
	 */

	
		
		boolean workDay = true;
		int day = 6;
		
		while(workDay) {
			if(day < 6) {
				System.out.println("I need a day off!");
			}
			else {
				System.out.println("I do not need a day off anymore!");
				workDay = false;
				//break;
			}
			
			
			day++;
		}
	}
}

