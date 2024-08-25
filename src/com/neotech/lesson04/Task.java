package com.neotech.lesson04;

public class Task {
	
	public static void main(String[] args) {
		
				// If it is Friday or not.
				// If it is Friday ---> I am going to watch a movie
						// If the date is 13 ---> I will watch a scary movie
						// If the date is not 13 ---> I will watch comedy
				// If it is not Friday ---> It is Not Friday, so I will study Java
				
		
		boolean isFriday = true;
		boolean dateIs13 = false;
		boolean dateIs15 = true; 
		
		if (isFriday) 
		{
			System.out.println("I am going to watch a movie!");
						
					if (dateIs13)
					{
						System.out.println("I will watch a scary movie!");
					}
					else
					{
						System.out.println("I will watch comedy!");
					}			
			
			
		}
		else
		{
			System.out.println("It is Not Friday, so I will study Java.");
		}
		
		
		
		//What if the task had also this requirement
				//If the date is 15 ---> I will watch a thriller!
		
		
		if (isFriday) 
		{
			System.out.println("I am going to watch a movie!");
						
					if (dateIs13)
					{
						System.out.println("I will watch a scary movie!");
					}
					else if (dateIs15)
					{
						System.out.println("I will watch a thriller!");
					}
					else
					{
						System.out.println("I will watch comedy!");
					}			
			
			
		}
		else
		{
			System.out.println("It is Not Friday, so I will study Java.");
		}
		
	}

}
