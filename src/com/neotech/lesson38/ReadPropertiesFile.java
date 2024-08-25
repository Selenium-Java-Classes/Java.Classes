package com.neotech.lesson38;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {

		// Step1: Locate the file
		String filePath = "/Users/sinemtok/eclipse-workspace/JavaBasicSinem/configuration_configs/Example.properties";

		// Step2: Read the file / create link to transfer data
		FileInputStream fis = new FileInputStream(filePath);
		
		// Step3: Create a properties object
		Properties prop = new Properties();
		
		//Step4: Load the data in the properties object
		prop.load(fis);
		
		// 
		String name = prop.getProperty("name");
		System.out.println("Name --> " + name);
		
		String lastName = prop.getProperty("lastName");
		System.out.println("Last Name --> " + lastName);
		
		String phone = prop.getProperty("phone");
		System.out.println("Phone --> " + phone);
		
		String state = prop.getProperty("state");
		System.out.println("State --> " + state);
		
		String year = prop.getProperty("year");
		System.out.println("Year --> " + year);
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		Set<Object> keys = prop.keySet();
		Collection<Object> values = prop.values();
		
		//We can print with sout;
		System.out.println(keys);
		System.out.println(values);
		
		System.out.println(); 
		
		//We can print with advanced-loop;
		for(Object key:keys) {
			System.out.println(key);
		}
		
		for(Object value:values) {
			System.out.println(value);
		}
		
		
	}
}



// Note1: Java IO is targeted at reading and writing data (input and output).

// Note2: First thing that come with reading --> locating the file <-- We need path

// Note3: We have two processes/classes -> 1) style input stream - 2) File output stream

// Note4: input means --> Read       /     Output means --> Write

// Note5: While we are reading we use -->  FileInputStream objectName = FileInputStream(filePath);

// Note6: First two steps are common, but the other steps are specific base on the file (.properties) type.

// Note7: We should create a properties object --> Properties objectName = new Properties();

// Note8: Properties are type of map

// Note9: Lastly, we need to load the data in the object. For that use --> load() method.

// Note10: While we are writing the keys and values, we should use .properties file & getProperty() method.

// Note11: For example -> Since the key name is "name", we put the name as a variable name.

// Note12: Since the java is case-sensetive, you should write the variable name and the passing name HAVE TO MATCH with porperties file.

// Note13: To get all the keys use --> .keySet() method --> Set<Object> giveName = objectName.keySet();

// Note14: To get all the values use --> .values() method --> Collection<Object> giveName = objectName.values();




