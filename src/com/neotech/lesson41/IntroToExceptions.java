package com.neotech.lesson41;

public class IntroToExceptions {

	public static void main(String[] args) throws Exception {
		
		int a = 10;
		int b = 0;
		System.out.println(a/b);  //-> Arithmetic Exception
		
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
		int [] array = {1,2,3,4};
		System.out.println(array[6]);  //-> ArrayIndexOutOfBounds Exception
		
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		Exception e = new Exception();
		//throw(e);  //-> Create an exception intentionally
		
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		NullPointerException npe = new NullPointerException();
		throw(npe); 
	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
		
		
		
		
		
	}
}


/* Note1: Exception means -->  something that out of the ordinary or 
		   		   		  --> something kind of differently for a specific situation */

/* Note2: Exception is a --> OBJECT which is thrown at runtime. 
   Thrown at runtime means -> when we are running code, an exception can appear/happen */

// Note3: In this example since we divide 10 to 0, it will give an Arithmetic Exception thread.

// Note4: Until you handle the exception, you cannot execute rest of the code

/* Note5: Error and Exception difference:
		  -> You can NOT handle the error no matter what you do
		  -> You can HANDLE the exceptions saying try to do something else */

/* Note6: We have two types of exceptions:
		  -> Checked Exception
		  -> Unchecked Exception */

// Note7: Checked exceptions --> will checked WITHOUT running --> NOT RunTimeException  

// Note8: Unchecked Exception --> will checked after running --> RunTimeException

// Note9: We can create ann object of Exception --> Exception e = new Exception();

// Note10: With the "throw" keyword, we can throw an exception intentionally. 

// Note11: When we throw an exception intentionally, next to the main method --> throws Exception





