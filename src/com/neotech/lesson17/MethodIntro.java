package com.neotech.lesson17;

public class MethodIntro {

		// this method does not return anything
		// it only prints on the screen
		// and it does not receive any parameters
		void greet() { // method header
			// method body
			System.out.println("hello");
			System.out.println("how are you doing?");
			System.out.println("bye!");
		}

		void greet2(String name) {
			System.out.println("hello " + name);
			System.out.println("how are you doing? " + name);
			System.out.println("bye! " + name);
		}

		public static void main(String[] args) {

			// call greet method
			// greet(); this wont work, i need an object first

			MethodIntro intro = new MethodIntro();
			intro.greet();

			System.out.println("-----------");
			intro.greet2("Jennifer");

			System.out.println("-----------");
			intro.greet2("Iana");


	}

}
