package com.neotech.lesson18;

import java.util.Arrays;

public class TwoD_ArrayIntro2 {

	public static void main(String[] args) {

		// 1D Array
		// int[] num = { 3, 7, 2 };

		// 2D Array
		int[][] nums = { 
				{ 5, 1, 3 }, 
				{ 9, -1, 6 }, 
				{ 2, 0, 7 }, 
				{ 8, 3, 4 } 
		};

		System.out.println(nums[1][2]);
		System.out.println(nums[3][0]);

		System.out.println(nums[0][2]); // 3
		System.out.println(nums[3][1]); // 3

		System.out.println("--------------------------------");

		// Nested enhanced for loop
		for (int[] row : nums) {

			// I will iterate the row (1D-Array) with an enhanced for loop
			for (int element : row) {
				System.out.print(element + " ");
			}

			System.out.println();
		}

		System.out.println("--------------------------------");

		// How to get the row with index 2
		int[] row2 = nums[2];
		System.out.println(Arrays.toString(row2));

		System.out.println("--------------------------------");

		for (int[] row : nums) {

			// I will iterate the row (1D-Array) with a normal for loop
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i] + " ");
			}

			System.out.println();

		}

	}
}
