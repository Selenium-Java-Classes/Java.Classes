package com.neotech.lesson41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {

	public static void main(String[] args) {

		String filePath = System.getProperty("user.dir") + "/extra/demo.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);// .

			// fis.close();

			Properties prop = new Properties();
			prop.load(fis); // .

			System.out.println(prop);

		} catch (FileNotFoundException fnfe) {
			
			System.out.println(fnfe.getMessage());
			System.out.println("Check your 'demo.properties' file location.");

		}catch (IOException ioe){
			
			System.out.println(ioe.getMessage());
			System.out.println("Could not load the properties file.");
		}
	}

}

// Note1: We can use one try and multiple catch
// Note2: The purpose of useing one try --> since the first one does not run, rest of it can not run
// Note3: When your file-folder link is wrong or misspelled--> FileNotFoundException 
// Note4: When you close your code with --> .close() --> it will say "Stream Closed" --> IOException
// Note5: IOexception -> Input Output Exception <-- FileInputStream / FileOutputStream


