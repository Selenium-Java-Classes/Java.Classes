package com.neotech.lesson10;

public class task1 {
public static void main(String[] args) {
	
	
	
	 //I want to celebrate my son's birthdays from 11 to 20 (Use for loop)
	// but not 13th birthday, because we are scared
	// Let's use for loop
	
	String birthday = "Happy birthday";
	

	
	for (int age = 11; age <=20; age++) {
		if (age ==13) { //We do not want to print 13, so we used if for the number we do not want to print.
			continue;  //We use continue because we want to celebrate 14,15,16,17,18,19,20th birthday still.
					   // If you use break instead of continue, it'll print until 12.
			
		}
		System.out.println(age +"- "+birthday);
	}
	
		System.out.println("-------------------");
	
	int age2 =10;  //We started from 10, because it will increase the age FIRST, so it will start from 11 to count.
	
	while (age2 <= 20) {
		
		age2++; //We have to use increment here, because we need to increase the age and then check.
		
		if(age2 ==13) {
			continue;
		}
		
		System.out.println(age2 +"- "+birthday);
		
		
	}
		int age3 = 1;
		
		do {
			System.out.println(age2 +"- "+birthday);
			age3++;
		} while(age3<=10);
	
	
	

}
}
