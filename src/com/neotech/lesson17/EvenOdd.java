package com.neotech.lesson17;

public class EvenOdd {

	void EvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("The number is even!");
		} else {
			System.out.println("The number is odd!");
		}
	}
	public static void main(String[] args) {
		EvenOdd  check = new EvenOdd();
		check.EvenOdd(34);
		check.EvenOdd(27);
}
}
