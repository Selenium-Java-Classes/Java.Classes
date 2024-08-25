package com.neotech.lesson24;

public class USA {
	
						//Instance Variables
	
	String state, stateCapital;
	
	public USA (String state, String stateCapital) {
		
		this.state = state;
		this.stateCapital = stateCapital;
	}

	
							//Let's create some methods
	
	
	public void displayState() {
		
		System.out.println(state);
	}
	
	public void displayStateCapital(){
		System.out.println(stateCapital);
	}
	
	public void displayInfo() {
		
		this.displayState();     		//We are calling a method, inside another method to display the state.
		this.displayStateCapital();     // We do not have to use "this" keyword. Compiler will already know what we are refering to.
	
	
	}
	

	
	
	public static void main(String[] args) {
		
		USA us1 =new USA ("NY", "Albany");
//		us1.displayState();					//We do not need them since we use this keyword.
//		us1.displayStateCapital();			//We do not need them since we use this keyword.
		
		us1.displayInfo();
		
	}
	
	
	
	
	
	
}
