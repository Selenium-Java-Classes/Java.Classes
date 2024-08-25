package com.neotech.lesson24;

															//Question

									/*
									 * Write program for multilevel inheritance where class A inherited by B and
									 * class B inherited by class by C.
									 */

class Mouse1 {
    String texture = "Shiny";

    public void setTexture(String texture) {
        System.out.println("Mouse texture: " + texture);
    }
}


class Mouse2 extends Mouse1 {
    boolean connected = true;

    public void connection() {
        System.out.println("Mouse connected!");
    }
}


class Mouse3 extends Mouse2 {
    String colors [] = { "Green", "Baby Blue", "Heather", "Turquoise", "Orange", "Red"};

    public void displayColor() {
    	for(String color : colors) {
    		 System.out.print("Color Section: ");
    		 System.out.println(color);
    	}
       
    }
}

