package com.neotech.lesson07;

import java.util.Scanner;

public class calculatorWithString {
	
public static void main(String[] args) {
		
		String operator;
	    Double number1, number2;

	    // create an object of Scanner class
	    Scanner scan = new Scanner(System.in);

	   
	    // ask users to enter numbers
	    System.out.println("Enter first number:");
	    number1 = scan.nextDouble();

	    System.out.println("Enter second number:");
	    number2 = scan.nextDouble();
	    
	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = scan.next();
	    
	    double result = 0; 
	    
	    switch (operator) {

	      case "+":   //We use ' ' because it is char
	        result = number1 + number2;
	        break;

	      case "-":
	        result = number1 - number2;
	        break;

	      case "*":
	        result = number1 * number2;
	        break;

	      case "/":
	        result = number1 / number2;
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    //If we want to write with if and switch;
	    //if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/"));
	    System.out.println("The result is "+result); //if we do not want error on result, we should give value to it which is 0.
	}

}



