package com.neotech.lesson21;

public class Bora {
	
					//QUESTION!
		/* Add two number using methods */
		
	
					//ANSWERS
	
				//With no parameter and NO Return type
	void addTwoNumber() {
		
		int result = 4+2;		
	}
	
	
				//With two parameter and NO Return type
	void addTwoNumberThatIGive(int a, int b) {
		int result = a + b;     //Do not give any value in the method part. Main oart will take over that responsibility.
		
	}
	
				//With NO parameter and WITH return type
	int addTwoNumberAndGiveMeTheResult () {
		
		int result = 8+9;
		 
		return result;       //Return type should be match with the method type. So,if method: int --> result: int
							 // Return should give the thing you want so, if the equation's name is result --> return name is result

	}
	
				//With two parameter and WITH return type
	
	int addTwoNumbersThatIGiveAndGiveMeTheResult (int num1, int num2) {
		
		int result = num1 + num2;
		
		return result;
		
		
		
	}
	
}

/* Note1: Whatever you do in method, it stays in method */	