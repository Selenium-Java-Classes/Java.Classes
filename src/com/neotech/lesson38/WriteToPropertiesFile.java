package com.neotech.lesson38;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {

		// Step1: Locate the file
		String filePath = "/Users/sinemtok/eclipse-workspace/JavaBasicSinem/configuration_configs/Example.properties";

		// Step2: Read the file / create link to transfer data
		FileInputStream fis = new FileInputStream(filePath);
		
		//Step3: Create Properties Object
		Properties prop = new Properties();
		
		//Step4: Load the data from the prop file
		prop.load(fis);
		
		/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
		
		// Step5: Change some data 
		prop.setProperty("state", "TX");
		
		// Step6: Add a new pair
		prop.setProperty("City", "Dallas");
		
		/* ~~~~~~~~~~~ Since I change and add, let's write ~~~~~~~~~~~~~~ */
		
		//Step1: Write the file / create link to send data
		FileOutputStream fos = new FileOutputStream(filePath);
		
		prop.store(fos, "We just updated the file");

	}

}


/* Note1: If I start writing driectly on the properties file --> Override
		  Instead of override --> 1)read 2)add new properties 3)write. */

// Note2: Since we have to read first before writing, we should use the steps for reading first.

// Note3: For changing the data use --> .setProperty() method.

//Note4: For adding new key:value pair --> .setProperty() method.

// Note5: For sending data use --> FileOutputStream

// Note6: For write to the file use --> .store() method.







