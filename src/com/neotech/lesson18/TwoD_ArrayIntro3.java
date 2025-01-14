package com.neotech.lesson18;

public class TwoD_ArrayIntro3 {
	public static void main(String[] args) {

		int[][] nums = { 
				{ 7, 2 }, 
				{ 9, 3, 8, 1 }, 
				{ 6 } 
		};

		System.out.println(nums[1][2]);
		System.out.println(nums[2][0]);

		// System.out.println(nums[0][2]); // run-time error

		System.out.println("--------------------------------");

		System.out.println("The number of rows is -> " + nums.length);
		System.out.println("The length of the row with index 1 -> " + nums[1].length);
		System.out.println("The length of the row with index 2 -> " + nums[2].length);

		System.out.println("--------------------------------");

		for (int row = 0; row < nums.length; row++) {
			// nums[row].length will give you the length of that specific row

			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();

		}

		System.out.println("--------------------------------");

		// Nested enhanced for loop
		for (int[] row : nums) {

			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();

		}
	}

}
