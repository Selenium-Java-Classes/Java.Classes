package com.neotech.lesson31;

public class Test_Car {
	
	public static void main(String[] args) {
		
		Car sedan = new Sedan(37000, "Black", 145);
		
		System.out.println(sedan.calculateSalePrice());
		
		Car truck = new Truck(22000, "Orange", 2100);
		System.out.println(truck.calculateSalePrice());
		
		
		
	}

}
