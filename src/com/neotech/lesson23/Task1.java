package com.neotech.lesson23;

public class Task1 {

	private double average(int[] array) {
		
		double result = 0;
		
		for (double num : array) {
			result += num/array.length;
		}
		return result;
	}

	public static void main(String[] args) {
		
		int [] array = { 23, 10, 41, 67, 88 };
		Task1 sinem = new Task1();
		
		double result = sinem.average(array);
		System.out.println("Average of the numbers -> " + result);
	}
}