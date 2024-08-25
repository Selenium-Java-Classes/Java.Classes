package com.neotech.lesson23;

public class World {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();  		
		
		p1.displayInfo(); 				//It will print default values, since we did not give them value.
		
		
		p1.name = "Sinem";
		p1.age = 25;
		p1.weight = 140;
		
		p1.displayInfo();				//It will print the values you gave now.
		
		
		
		Person p2 = new Person("Betul", 26);  		
		p2.displayInfo();
		
	}

}


// Note1: If you did not create any constructer, Java will create default.
// Note2: The constructer is a method as well.
// Note3: The name of the constructer has to same as class's name.
// Note4: In the constructor there is not "return".






