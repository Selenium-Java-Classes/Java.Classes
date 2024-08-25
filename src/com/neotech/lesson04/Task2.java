package com.neotech.lesson04;

public class Task2 {
	
	public static void main(String[] args) {
		
		// Write a Java program if the student has completed the quiz
		// If the student did the quiz ---> check the score and give these evaluations;
				// If the score is 90 or above ---> "A, Great Job!"
				//If the score is 80 to 90 ---> "B, Well Done!"
				//If the score is 70 to 80 ---> "C, You Passed!"
				// Else ---> "Try harder next time!"
		
		// step by step
				//1. if the student did the quiz
						//if score is >=90 ---> A
						// else if score is >=80 ---> B
						// else if score is >=70 ---> C
						// else if ...
						// else ...
		
				// 2. else (the student did not complete the quiz
		
		boolean quizIsDone = true;
		int score = 60;
		
		if (quizIsDone)
		{
			if (score >=90)
			{
				System.out.println("A, Great Job!");
			}
			else if (score >=80)
			{
				System.out.println("B, Well Done!");
			}
			else if (score >=70)
			{
				System.out.println("C, You Passed!");
			}
			else 
			{
				System.out.println("Try harder next time!");
			}
		}
		else // quiz is not done
		{
			System.out.println("You did not do the quiz, so you failed.");
		}
		
		
		
	}

}
