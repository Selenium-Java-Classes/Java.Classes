package com.neotech.lesson21;

public class SubStringDemo {
	
	public static void main(String[] args) {
		
		String sentence = " I am kind of sleepy because I woke up at 4am. ";
		
		/* Note1: If you want to print them seperatly you should create another string. */
		String sentence2 = sentence.substring(5, 8);       //Now the variable is changed.
		System.out.println(sentence2);
			
		/* Note2: You can print it like this as well */
		System.out.println( sentence.substring(5, 8)  );	//8 and 5 is not included. So, it will calculate between them. 
		
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//		
		
		
		System.out.println(  sentence.substring(5) );  		//It will start from the index 5 and continue en of the sentence.
															//because we did not put end index.
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//		

		
		
	}

}
