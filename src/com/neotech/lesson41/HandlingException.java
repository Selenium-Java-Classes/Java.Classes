package com.neotech.lesson41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {

		String path = "";
		
		try {
			FileInputStream fis = new FileInputStream(path);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//System.out.println("FileNotFount Exception caught!!");
		}

	
	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

		
		try {
			
			int a = 5;
			int b = 0;
			
			System.out.println(a/b);
		
		}catch (ArithmeticException ae) {
			System.out.println(ae);
		}
		
	}

}


// Note1: We can use .printStackTrace() -> helps you trace back the sequence of method calls that led to the exception

// Note2: If we know the exception, we can print our custom message as well. 

// Note3: You can also use Source -> Surround With -> try-catch block

// Note4: 





