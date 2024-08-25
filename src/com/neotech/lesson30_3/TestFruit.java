package com.neotech.lesson30_3;

public class TestFruit {
	
	public static void main(String[] args) {
		
		Apple a = new Apple("Green");
		a.peel();
		a.wash();
		a.color = "Green";
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		
		Walnut w = new Walnut("Brown");
		w.crack();
		w.color = "Brown";
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("Aplle is " + a.color + " and walnut is " + w.color);
	}
	
}
