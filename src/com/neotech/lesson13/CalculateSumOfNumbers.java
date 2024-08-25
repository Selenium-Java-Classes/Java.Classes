package com.neotech.lesson13;

public class CalculateSumOfNumbers {

	public static void main(String[] args) {
		
		
		//Create an array on integers and calculate the sum of all integer elements in an array.
		
						int [] nums = {13,25,7,64};
						System.out.println("Advanced For Loop: ");
						int sum = 0;
						for (int number : nums) {
							sum += number;
					}
						System.out.println(sum);

						System.out.println("\nForLoop");
						sum = 0; 
						for (int i = 0; i < nums.length; i++) {
							sum += nums[i];
					}
						System.out.println(sum);
    }
}
