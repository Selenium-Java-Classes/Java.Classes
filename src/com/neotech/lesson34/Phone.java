package com.neotech.lesson34;

public class Phone {

	private String serialNumber;
	public String brand;
	private String password;

	public Phone(String serialNumber, String brand, String password) { // Contructor of Phone

		this.serialNumber = serialNumber;
		this.brand = brand;
		this.password = password;

	}

	public void displayInfo() { // Behavior of phone
		System.out.println("This is a " + brand + " phone with serialNumber " + serialNumber);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// If the variables are private, you need setter and getter to encapsulate them;

	public String getSerialNumber(String password) {
		if(this.password.equals(password)) {
			return serialNumber;
		}else {
			return "Access Denied!!";
		}
	}

}
