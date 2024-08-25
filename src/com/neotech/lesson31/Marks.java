package com.neotech.lesson31;

/*Create a class 'Marks' with an abstract method 'getAverage'*/

abstract class Marks {

	abstract double getAverage();

}

class StudentA extends Marks {

	private int vize1;
	private int vize2;
	private int finall;

	/* The constructor of StudentA takes the marks of THREE subjects as parameter */ 	
	public StudentA(int v1, int v2, int f1) {
		this.vize1 = v1;
		this.vize2 = v2;
		this.finall = f1;
	}

	/* Provide implementation of the abstract method */
	public double getAverage() {
		return (vize1 + vize2 + finall) / 3;
	}

}

class StudentB extends Marks {

	private int vize1;
	private int vize2;
	private int vize3;
	private int finall;

	/* The constructor of StudentB takes the marks of FOUR subjects as parameter */ 
	public StudentB(int v1, int v2, int v3, int f1) {
		this.vize1 = v1;
		this.vize2 = v2;
		this.vize3 = v3;
		this.finall = f1;
	}
	
	/* Provide implementation of the abstract method */
	public double getAverage() {
		return (vize1 + vize2 + vize3 + finall) / 4;
	}
}