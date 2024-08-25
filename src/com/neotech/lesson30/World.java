package com.neotech.lesson30;

public class World {

	public static void main(String[] args) {
		
		Human.planet = "Earth";
		
		Human h1 = new Human();
		System.out.println(h1.name + " lives on " + Human.planet);
	
		Human h2 = new Human("Ceylin");
		System.out.println(h2.name + " lives on " + Human.planet);
		
		
		System.out.println("------------------------------------\n");
		
		Human.planet = "Mars";
		System.out.println(h2.name + " lives on " + Human.planet);
		
		System.out.println("------------------------------------\n");
		
		Human h3;
		h3 = new Albanian("Geri");
		System.out.println(h3.name + " lives on " + Human.planet + ", that's why konusmayi bilmiyor.");
	
		System.out.println("------------------------------------\n");
		
		Human h4 = new Turkish("Betul");
		//h4 can not-->  makeBaklava
		//When you try h4.makeBaklava it will give a Compile Time Error because h4 is of type Human
		
		Turkish t1 = (Turkish) h4;
		t1.makeBaklava();
		
		
		System.out.println("------------------------------------\n");

		System.out.println("Let's make the peopple talk, by givving money: ");
	
		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();
		
		System.out.println("------------------------------------\n");
		
		Human[] humans = new Human[4];
		humans[0] = h1;
		humans[1] = h2;
		humans[2] = h3;
		humans[3] = h4;
		
		for(Human element : humans) {
			element.talk();
		}
	
	}
}



// No need to create an object to access class variable.
// h1.planet --> Human.planet - best way to use it because you can use for all of them

/*  We are doing up-casting:
 *  Human h3; --> Declaring a variable of type Human
 *  h3 = new Albanian(); --> Assign the variable */

/* Human h4 = new Turkish("Betul"); --> We are doing up-casting automatically */

/* Turkish t1 = (Turkish) h4; --> We are doing down-casting, manually */






