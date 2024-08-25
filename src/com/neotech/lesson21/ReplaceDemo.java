package com.neotech.lesson21;

public class ReplaceDemo {
	
	public static void main(String[] args) {
		 
		String sentence = " I am kind of sleepy because I woke up at 4am and it is 6.29am right now.";
		
		/* Note1: If you want to print them seperatly you should create another string variable. */
		String sentence2 = sentence.replace('a', 'E');
		System.out.println(sentence2);
		
		
		/* Note2: You can print it like this as well */
		System.out.println(   sentence.replace( 'a', 'E') );	//You can use it as a char. 
		
		System.out.println(   sentence.replace( "sleepy", "happy") );	//You can use it as a string.	
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//		

		/* Note1: If you want to print them seperatly you should create another string variable. */
		String sentence3 = sentence.replaceAll("[a-z]", "~");		//It will replace only the lowercase letters
		System.out.println(sentence3);
		
		/* Note2: You can print it like this as well */
		System.out.println( sentence.replaceAll("[a-z]", "~") );    //It replace only the lowercase letters.
		
		System.out.println( sentence.replaceAll("[A-Z]", "~") );    //It replace only the uppercase letters.
		
		System.out.println( sentence.replaceAll( "[a-zA-Z]", "~") ); //It will replace only upper and lowercase letters.
		
		System.out.println( sentence.replaceAll( "[0-9]", "~") ); 	 //It will only replace the numbers between numbers 0 and 9.
		
		System.out.println( sentence.replaceAll( "[36]", "~") ); 	 //It will only replace the numbers of 3 and 6.
		
		System.out.println( sentence.replaceAll("[a-zA-Z0-9]", "~") ); //It will replace all numbers and letter but characters. (space, dot, comma etc.)
		
		System.out.println( sentence.replaceAll(".", "~") );		  //It will replace the (.) to (~).
	
		
	
	}

}


/* !!!!!NOTE: DO NOT FORGET SQUARE BRACKETS ([]) while you are writing the range. */