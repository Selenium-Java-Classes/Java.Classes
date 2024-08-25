package com.neotech.lesson17;

public class email {
	/*
	 * Create a method createEmail(). Based on provided users firstName, lastName
	 * and emailType Your method should return complete email address. Example:
	 * firstName -> john lastName -> snow emailType -> gmail return
	 * ->johnsnow@gmail.com
	 */

	String emailsversions(String firstName, String lastName, String emailType) {
		String mail = firstName + lastName + "@" + emailType + ".com";
		return mail;
	}

	public static void main(String[] args) {

		email sinem = new email();

		String gmail = sinem.emailsversions("sinem", "tok", "gmail");
		System.out.println(gmail);
	}
}
