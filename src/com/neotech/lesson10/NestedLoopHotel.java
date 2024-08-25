package com.neotech.lesson10;

public class NestedLoopHotel {
	
	public static void main(String[] args) {
		
		
		for( int floor=1; floor <=4; floor++) {
			
			System.out.println ("Floor ---> "+floor);
			
			for (int room =1; room <=6; room++) {   // 6 room for every floor, since we did not close the brackets.
				System.out.print(floor +"."+ room+ " | ");
				
			}
			
			System.out.println();   //Bring me to the next line
		}
		
	}

}
