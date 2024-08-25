package com.neotech.lesson23;

public class Task2 {
	
	protected int sum(int[] array) {
        int result = 0;
        
        for (int num : array) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
       
    	int[] array = { 23, 10, 41, 67, 88 };
        Task2 sinem = new Task2();
        
        int result = sinem.sum(array);
        System.out.println("Sum of the numbers -> " + result);
    }
}
