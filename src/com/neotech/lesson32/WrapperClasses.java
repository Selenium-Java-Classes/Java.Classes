package com.neotech.lesson32;

public class WrapperClasses {

	public static void main(String[] args) {
		
	
	Integer number1 = new Integer(20);   
	/* Note1: We are boxing an int (primitive) into an Integer. */
	
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
	
	int num2 = number1.intValue(); 
	/*Note1: We are unboxing the Integer --> we are GETTING the value from the Integer object */
	
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */	
								  /*INTEGER*/
	
	Integer number2 = 30; /* --> We are AUTO BOXING the values. */

	int num3 = number2; /* --> We are AUTO UNBOXING the values. */
	
	
								/*CHARACTER*/	
	
	Character c1 = '%';	/* --> We are AUTO BOXING the values. */
	char c2 = c1;		/* --> We are AUTO UNBOXING the values. */
	 
							     /*BYTE*/	
	
	Byte b1 = 14;	/* --> We are AUTO BOXING the values. */
	System.out.println(b1);

							   /*BOOLEAN*/	

	Boolean b2 = true;	/* --> We are AUTO BOXING the values. */
	boolean b3 = b2;		/* --> We are AUTO UNBOXING the values. */

							  /*DOUBLE*/	

	Double d1 = 25.07;	/* --> We are AUTO BOXING the values. */
	double d2 = d1;		/* --> We are AUTO UNBOXING the values. */
	
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
	
			System.out.println(number2.MAX_VALUE);  //-> Maximum value that can be assign to an int
			System.out.println(number2.MIN_VALUE);  //-> Minimum value that can be assign to an int
			
/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
			
	
	
	
	}
}


// Note1: With the wrappers --> you can access the every methods.

// Note2: You can print the value of the wrapper DIRECTLY.

// Note3: While you are printing the value with an method, you do NOT have to recall it.

// Note4: If the value (MAX_VALUE / MIN_VALUE etc.) blue and bold and italic ---> that means those are "Static"

/* Note5: If it has full name and start with upper case --> Wrapper
    	  If it has shoter name and start with lower case --> Primitive */




