package com.neotech.lesson30;

public class Polymorphism {

	public void calculateInterest() {

	}

	public void calculateInterest(int a) {

	}

	public void calculateInterest(String a) {

	}

	public static void main(String[] args) {

		Polymorphism pm = new Polymorphism();
		pm.calculateInterest(5);
		pm.calculateInterest("Sinem");
	}
}



//Polymorphism -> Different way to calculate the interest BASED ON THE PARAMETERS
//It is Compile time Polymorphism -> becase Java know which one to run.
//It is early binding because -> 
//It is static binding because -> 