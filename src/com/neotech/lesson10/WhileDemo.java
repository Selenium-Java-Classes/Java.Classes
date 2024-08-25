package com.neotech.lesson10;

public class WhileDemo {
	
	
	public static void main(String[] args) {
		String greeting = "Miremengjes";
		
		
		// DO NOT REPEAT THE CODE!!!
//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);
//		System.out.println(greeting);
		
		
		
		int number = 0;
		while (number <= 5) {
			
			
			System.out.println(greeting); //We can either write like this
			
			System.out.println(number+" - "+greeting); //or like this as well.
			
			number++; //If you forget it, the code repeat itself infinite
			 		  //When you put it before printing, it will start counting the one greater number.
		}
			

		System.out.println("--------------------------------------");
		
		int count = 5;
		
		while (count >0) {
			System.out.println("Happy Mother's Day!!!!");
			count--;
		}
		
		System.out.println("--------------------------------------");
		 
		int i = 0;
		while (true) {    //Since it is true it will be true forever, so it will repeat infinite.
		
			System.out.println(greeting);
			i++;
			break; //If you put break after printing it will print only once.
		
		}

		System.out.println("--------------------------------------");
		 
		int b = 0;
		while (true) {    //Since it is true it will be true forever, so it will repeat infinite.
		if (b==2) {
			break;
		}
			System.out.println(greeting);
			b++;
		
		
		
}
}
}