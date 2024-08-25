package com.neotech.lesson31;

public class Test_Doctor {
	
	public static void main(String[] args) {


		Doctor doc = new Doctor();
		
		doc.setEmail("doctor@gmail.com");
		doc.setLicenceID(34654654);
		doc.setPhoneNumber(54654756);
		
		
		System.out.println(doc.getEmail());
		System.out.println(doc.getLicenceID());
		System.out.println(doc.getPhoneNumber());
		
		
		
	}

}
