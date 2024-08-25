package com.neotech.lesson21;

public class String_Methods {
	
	public static void main(String[] args) {
		

	String str = "Pershendetje Everyone";				

	System.out.println(   str.length()  );		//It will return the number of the characters of string. --> int
	
	System.out.println(   str.isEmpty() );		//If there 0 characters, it will return true. Otherwise false. --> boolean
	
	System.out.println(   str.toLowerCase() );  //It will return the letters to lowercase. --> String
	
	System.out.println(   str.toUpperCase() );  //It will return the letters to uppercase. --> String
	
	boolean equal = str.equals("PERSHENDETJE");  // I'm storing this method into a boolean. return --> boolean
	System.out.println(equal);
	
	System.out.println( str.equalsIgnoreCase("PERSHENDETJE") );		//It does not matter the case of the letters as long as their spell is mathichg with the orj. one.  --> boolean
	
	System.out.println(   str.contains("sh") );	//If it find the string inside of the method find themselves in the main string, return true. Otherwise false.  --> String 
	
	System.out.println(   str.contains ("SH".toLowerCase() ) ); //If we check "sh" with to lowercase, the return is true and it checks it convert to lowercase.
	System.out.println(    "SH".toLowerCase()  );              //You can use the method like this as well. No need to contains method.
	
	System.out.println(   str.startsWith("P") );	//If you know the first letters of the string, it will retund as true.	--> boolean		
	System.out.println(   str.startsWith("Persh"));  //The letters match with the string
	System.out.println(   str.startsWith("per"));	  // Since it does not match with 'p' with the main string, it is false.
	
	
	System.out.println(    str.endsWith("tej")  ); 		//If it match with the main string's letter, it will return as true. -->boolean
	
	
	
	String name = "Sinem".concat("-").concat("love");   //Since there are two methods connect to each-others, it calls Method Chaning
	System.out.println(name);											
	
	
	String name2 = "Sinem".toUpperCase().concat("-").concat("love");
	System.out.println(name2);
	
	//String name3 = "Sinem".length().concat("-");		//We cannot concat int to string. We can only concat String to String, otherwise Java will complain.
	
	System.out.println(  "Sinem".concat("heart").length() );					//We can use it, step by step. concat connect to String and the lenght calculate the letter after concat.
	
	
	
	String str2 = "         Sinem     woke-up too earlyyyyyyy ";
	System.out.println(     str2.trim()  ); 			//It will delete the spaces only before and after the sentence or word. NOT between --> String
	System.out.println(     str2.length() );			//It will calculate the lenght with the spaces since no trim.
	System.out.println(     str2.trim().length() );		//It will calculate without the spaces in the beginning and end. 
	
	
	String str3 = "Gary is a hardworking person ";				
	System.out.println(  str3.charAt(2) );		//It will get index of the String. --> char	
	System.out.println(  str3.indexOf('r') ); 	//It will tell which index of 'r' letter  -> return int
	System.out.println(  str.indexOf("r", 6) ); //It will calculate the second index of r. -> return int

	
	
	
	
	}
}
