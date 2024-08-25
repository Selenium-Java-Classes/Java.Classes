package com.neotech.lesson07;

import java.util.Scanner;

public class CalculatorSwitchCase {
	public static void main(String[] args) {
		
		char operator;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner scan = new Scanner(System.in);

	   
	    // ask users to enter numbers
	    System.out.println("Enter first number:");
	    number1 = scan.nextDouble();

	    System.out.println("Enter second number:");
	    number2 = scan.nextDouble();
	    
	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = scan.next().charAt(0);
	    
	   // double result = 0; 
	    switch (operator) {

	      case '+':   //We use ' ' because it is char
	        result = number1 + number2;
	        System.out.println("The result is " +result);
	        break;

	      case '-':
	        result = number1 - number2;
	        System.out.println("The result is " +result);
	        break;

	      case '*':
	        result = number1 * number2;
	        System.out.println("The result is " +result);
	        break;

	      case '/':
	        result = number1 / number2;
	        System.out.println("The result is " +result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	   /// System.out.println("The result is "+result); //if we do not want error on result, we should give value to it which is 0.
	}

}
