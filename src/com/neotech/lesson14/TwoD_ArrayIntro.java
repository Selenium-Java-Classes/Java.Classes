package com.neotech.lesson14;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {
		
		
		int [][] numbers = new int [3][4];  //[rows][columns]
		
				numbers[1][2] = 7;
				numbers[2][0] = 9;
				numbers[0][0] = 4;
				numbers[0][2] = 5;

				// re-assign a value to one element
				numbers[2][0] += -1; // decrementing by 1

				// compile-time error -> Before running the code
				// numbers[1][1] = "cat";

				// run-time error -> After running the code
				// numbers[3][0] = 3;

				int rows = numbers.length;
				System.out.println("The number of rows is -> " + rows);

				// The length of the row with index 1
				int cols1 = numbers[1].length;
				System.out.println("The length of the row with index 1 is -> " + cols1);

				System.out.println("--------------------------------");

				int[][] numbers2 = { 
						{ 7, 8, 2 }, 
						{ 9, 1, 6 }, 
						{ 3, 1, 7 }, 
						{ 2, 5, 8 } 
				};

				// The index of 6 is -> 1,2
				// The index of 8 is -> 0,1
				// The index of 8 is -> 3,2

			}

		}


