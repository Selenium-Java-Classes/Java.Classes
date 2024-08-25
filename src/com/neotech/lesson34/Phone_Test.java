package com.neotech.lesson34;

public class Phone_Test {
	
	public static void main(String[] args) {
		
		Phone phone1 = new Phone("999-000-000", "Iphone 14+", "G140899");
		
		phone1.displayInfo();
		
		/* We can change (re-assign) the password since it is not private variable.;
				phone1.password = "S070499"; */
		
		String serialnum = phone1.getSerialNumber("pas@123");
		System.out.println("The serial number is: " + serialnum);
		
		
		
	}

}
