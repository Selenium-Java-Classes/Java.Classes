package com.neotech.lesson13;

public class Task3NamesAndGrades {

	public static void main(String[] args) {
		/*
		 * Create a 2D array that the first row will contain 4 names and 
		 * the second row will contain grades. 
		 * Then your program should print the names of the students that have A or B grade.
		 */
		
		
		String [][] namesAndGrades= {{"Jordan", "Valentin", "Aspen", "Kalynn"},
									 {"A","B","C","D"}
		};
		
		System.out.println("Results of the quiz!!");
		for(int i=0; i<namesAndGrades.length; i++) {
			if (namesAndGrades[1][i].equals("A") ||namesAndGrades[1][i].equals("B")) {
				System.out.println(namesAndGrades[0][i]);
			}
		}
		
		System.out.println("------------------");
		System.out.println(namesAndGrades[0][0] +" --> "+namesAndGrades[1][0]);
		System.out.println(namesAndGrades[0][1] +" --> "+namesAndGrades[1][1]);
		
		System.out.println("\n------------------");
		
		String[] names = namesAndGrades[0];
		String[] letterGrades = namesAndGrades[1];

		for (int i = 0; i < letterGrades.length; i++) {
			String letterGrade = letterGrades[i];
			if (letterGrade.equals("A") || letterGrade.equals("B")) {
				System.out.println(names[i]);
			}
		}
	}

}

/*
 * Note: namesAndGrades[1] --> The second row of the array, which contains the
 *    						   grades.
 * 
 * Note1: namesAndGrades[0] --> The first row of the array, which contains the
 *								names.
 * 
 * Note2: namesAndGrades[0][i] --> Accessing specific elements within those
 * 								   rows, where i is a variable representing the column index.
 * 
 * Note3: namesAndGrades[1][i] --> Accessing specific elements within those
 * 								   rows, where "i" is a variable representing the column index.
 */






