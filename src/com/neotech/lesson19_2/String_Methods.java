package com.neotech.lesson19_2;

public class String_Methods {
	
	
	public static void main(String[] args) {

		int a = 5; //int is a primitive data type
		
		//1st way we used to create a String ---> String literal
		String name = "Sabah";
		//In this way, Java will use a String pool.
		
		
		//2nd way to create a String ---> using NEW keyword
		String name2 = new String("Sara"); //I am using new keyword	
		//In this way, the JVM is forced to create a new String reference everytime.
		
		
		
		int size = name.length();
		//when I say name. --> trying to access something on the String class
		System.out.println("The length of the name is: " + size);
		
		String school  = "Neotech";
		System.out.println("The length of the school name is: " + school.length());
		
		String school2  = "               Neotech             ";
		System.out.println("The length of the school name is: " + school2.length());

		
		
		String city = "New York";
		String lowerCaseCity = city.toLowerCase();
		System.out.println(lowerCaseCity);
		
		System.out.println(city.toUpperCase());
		
		//what is the value of city???
		System.out.println(city); //String objects are immutable - it will not change!!!
		
		
		city = "New York City"; //this is a new String, I did not change New York to New York City.
		
		String newCity = "New York"; //this is not a new String, it existed in the pool (line 32)
		
		
		String sentence = "The size of" + school + " is " + school.length();
		System.out.println(sentence);
		
		String firstName = "Neha";
		String lastName = "Dotiya";
		
		String fullName = firstName + lastName;
		System.out.println(fullName);
		String fullName2 = firstName.concat(lastName);
		System.out.println(fullName2);

		//what if I wanted to add a space in between first and last name???
		String nameWithSpace = firstName + " " + lastName;
		System.out.println(nameWithSpace);
		
		String nameWithSpace2 = firstName.concat(" ").concat(lastName); //method chaining
		System.out.println(nameWithSpace2);
		
		//method chaining: I can call all methods belonging to a certain object right after 
		//another method
		String methodChaining = firstName.concat(" ").concat(lastName).concat(" ").concat(school).toUpperCase();
		System.out.println(methodChaining);
		
		
		
		String str = "";
		System.out.println(str.isEmpty());
		//sSystem.out.println(str.isBlank());
		
		
		String str2 = "				Today 			is tuesday and 				we are 	"
				+ "learning some cool				stuff				!!!				";
		
		System.out.println(str2.trim());
		
		System.out.println("Length of str2 is: " + str2.length());
		System.out.println("Length of str2.trim() is: " + str2.trim().length());
		
		
		int[] num = {1,2,3,4};
		System.out.println("The array length is: " + num.length); //this is a property of arrays
		
		
	}


}
