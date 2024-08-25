package com.neotech.lesson18;

public class Task2 {

	void greeting(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Merhabalar caniiiim");
		}
	}

	public static void main(String[] args) {
		Task2 task = new Task2();
		task.greeting(7);
	}
}
