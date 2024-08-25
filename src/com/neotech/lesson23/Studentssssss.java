package com.neotech.lesson23;

public class Studentssssss {
	

	public String name;
	private int age;
	private int weight;
	
	public Studentssssss (String sName, int sAge, int sWeight) {	
		
			name = sName;
			age = sAge;	
			weight = sWeight;
	}
	public void studentInfo() {
			
			System.out.println("Name: " +name+ " \nAge: "+age+" \nWeight: "+ weight + " pounds");
	}
	
	
	public static void main(String[] args) {
		
		Studentssssss s1 = new Studentssssss("Aspen", 19, 126);  		
		s1.studentInfo();
	}
	

}
