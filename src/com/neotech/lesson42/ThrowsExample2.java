package com.neotech.lesson42;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ThrowsExample2 {
	
	public static void main(String[] args) {
		
		try {
			read(" ");
		
		}catch (FileNotFoundException fnfe) {
			System.out.println(fnfe.getMessage());
		}
		
	}
	
	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(filePath);
	}
}


// Note1: If you want to handle the situation --> try-catch block.
// Note2: Let's say you use throws keyword again in the main method, it will show the exception error. 