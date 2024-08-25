package com.neotech.lesson31;

public class Doctor {

	private long licenceID;
	private String email;
	private long phoneNumber;

	// Getters:
	public long getLicenceID() {
		return licenceID;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	// Setters:
	public void setLicenceID(long licenceID) {
		this.licenceID = licenceID;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		if (!email.isEmpty()) {
			if (email.contains("@gmail")) {
				this.email = email;
			} else {
				System.out.println("You have to use gmail account.");
			}

		} else {
			System.out.println("E-mail can NOT be empty!");
		}
	}
}
