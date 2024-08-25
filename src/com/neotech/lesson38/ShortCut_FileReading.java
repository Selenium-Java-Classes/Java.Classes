package com.neotech.lesson38;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ShortCut_FileReading {

	public static void main(String[] args) throws IOException {
		
		//Step1: Find user directory
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		
		//Step2: Find username
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		//Step3: Get the Operating System (os) info
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		//We can create a dynamic path
		String dynamicPath = System.getProperty("user.dir") + "/configuration_configs/conf.properties";
		System.out.println(dynamicPath);
		
		//Read the file and load all the data in prop object
		FileInputStream fis = new FileInputStream(dynamicPath);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		//Get the url way1
		String url = prop.getProperty("url");
		System.out.println(url); 
		
		//Get the url way2
		System.out.println(prop.getProperty("url"));
		
		
	}
}

// Note1: We can access them with my computer or someoone else's. This one does not limit who access.

// Note2: We are using System class wth getProperty method  --> System.getProperty()

// Note3: We are using user directory to see where are we getting, and we put it inside of the method --> System.getProperty("user.dir")

// Note4: For finding the user name, we are writing --> ("user.name")

// Note5: For gettong the os which is operating system info, we are writing --> ("os.name")

/* Note6: To have dynamic path we are going to combine directory and path in the properties of file.
		  --> String dynamicPath = System.getProperty("user.dir") + "/configuration_configs/conf.properties"; */
