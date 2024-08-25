package com.neotech.lesson25;

public class CalculateArea {

	static void volume(int a, int b) {  //-> Rectangle
		System.out.println((a*b)*2);
	}
	
	static void volume (int p) {		//->Square
		System.out.println(p * p);
	}
	
	static void volume (int a, int b, int c) {	//->Box
		System.out.println(a*b*c);
	}
	
	
	public static void main(String[] args) {
		
		CalculateArea c = new CalculateArea();
		
		c.volume(6, 9);
		c.volume(20);
		c.volume(13, 12, 7); 
		
		
	}
}
