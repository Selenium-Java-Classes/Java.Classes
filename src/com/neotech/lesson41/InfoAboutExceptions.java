package com.neotech.lesson41;

public class InfoAboutExceptions {

	public static void main(String[] args) {

		String str = "Hello";

		try {

			char c = str.charAt(15);

		} catch (StringIndexOutOfBoundsException sio) {
			
			sio.printStackTrace();
			System.out.println(sio);
			System.out.println(sio.getMessage()); //-> Default message
			System.out.println("You are trying to get wrong index!"); //->Custom message
		}
		
		System.out.println();
		
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		String str2 = "World";
		
		try {
			
			char w = str2.charAt(25);
			System.out.println(w);
			
			
			int a = 3;
			int b = 0;
			System.out.println(a/b);
			
			
			
		} catch (StringIndexOutOfBoundsException siobe) {
			
			System.out.println(siobe);
			System.out.println(siobe.getMessage());
		
		} catch (ArithmeticException ae) {
			System.out.println(ae);
			System.out.println(ae.getMessage());
		}
	}

}

// Note1: try-catch it is simiar to if-else 

// Note2: try --> to do something --> put the code you want to execute

// Note3: catch --> if something goes wrong / if there is an exception catch it --> Shows the user what happened.

// Note4: Since you cannot memorize all the exceptions, you can get the excepion from console after you run the code.

// Note5: printStackTrace() --> It gives the details of what went wrong on the console.

// Note6: When we print the name of the exception --> gives the exception name

// Note7: When we print the message --> .getMessage() --> it gives the message telling the probles

// Note8: If an exception happens insie the try block --> the rest of the code in the try block will NOT execute

/* Note9: When we have multiple possible exceptions;
		  -> You can keep 1 catch block and generalize them as Exception 
		  -> You can use mltiple catch blocks (catch block for each of them) */

// Note10: You can use Exception since it is inheritance instead of specificly write the exception
// Note11: If you use the specific exception, you can find the problem easily.




