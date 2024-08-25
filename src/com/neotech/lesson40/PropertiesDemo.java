package com.neotech.lesson40;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		/* The path of this project (in my computer) */
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		/* I have to created the full path to the file */
		String filePath = projectPath + "/extra/demo.properties";
		System.out.println(filePath);

		/* fis will help me read the file */
		FileInputStream fis = new FileInputStream(filePath);

		/* proper is a Map (Key-Value pairs) */
		Properties proper = new Properties();

		/* load() method will help me read from the file to the proper-map */
		proper.load(fis);
		System.out.println(proper);

		/* first way */
		Object firstName = proper.get("FirstName");
		System.out.println(firstName);

		/* second way - correct way */
		String school = proper.getProperty("School");

		/* get the age as a String because of getProperty() */
		String age = proper.getProperty("Age");
		System.out.println(age);

		/* add more key-value pair */
		proper.setProperty("SSN", "123-345-5678");
		System.out.println(proper);

		/* Re-assign the Age */
		proper.setProperty("Age", "27");
		System.out.println(proper);

		/* ~~~~~~~~~~~~ Now let us save into a New File ~~~~~~~~~~~~ */

		/* The path to the new file */
		String newPath = projectPath + "/extra/NewFile.txt";
		FileOutputStream fos = new FileOutputStream(newPath);

		proper.store(fos, "Geri is very smart like me !!");

	}
}
