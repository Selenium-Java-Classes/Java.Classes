package com.neotech.lesson10;

public class WhileContinue {
	public static void main(String[] args) {
		
		String greeting = "Miremengjes";
		
		
		int i = 0;
		while (true) {    //Since it is true it will be true forever, so it will repeat infinite.
		if (i==2) {
			continue;
		}
			System.out.println(greeting);
			i++;
			
	}

}
}