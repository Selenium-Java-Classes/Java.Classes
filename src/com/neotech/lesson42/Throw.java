package com.neotech.lesson42;

public class Throw {

	public static void main(String[] args) throws Exception {

		Exception ex = new Exception();

		// throw ex;

		// throwException();

		// withdraw(200, 5000); //-> You do not handling by this
		
		try {
			withdraw(200, 5000);
		
		}catch (InsufficientFundsException ife) {
			System.out.println(ife.getMessage());
		
		}finally {
			System.out.println("Give the card back.");
			System.out.println("Other clean up code!");
		}

	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	public static void withdraw(int balance, int amount) throws InsufficientFundsException {

		if (amount > balance) {
			throw new InsufficientFundsException ("Insufficient Funds!!");
		}
	}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

	public static void throwException() {

		throw new ArithmeticException();
	}

}

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String message) {

		super(message);
	}
}

// Note1: throw ex --> checked --> so it will copmplain before run the code

// Note2: throwException() --> unchecked --> so it will complain after run the code

// Note3: checked or unchecked if you do not throws Exception, Java will complain 

// Note4: In the second class since we extend the exception --> it automatically an exception object

// Note5: For handling the situation, you should use try-catch block inside of the main method

// Note6: Finally keyword uses at the end of the handling part and it is optional

/* Note7: Finally -> if we have a scanner and we want to close it.
				  -> if we have connection to a file or database we can close it etc.
				  -> It basically makes some cleaning after the code done. */








