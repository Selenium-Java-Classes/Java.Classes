package com.neotech.lesson06;

import java.util.Scanner;

public class Task3DifferentVersion {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your gender (M/F);");
		
		char gender = input.next().charAt(0);
		
		System.out.println("Are you rich? (true/false)");
		boolean rich = input.nextBoolean();
		
		
		if(gender == 'F' && rich) {
			System.out.println(" You are a girl and rich! Have fun with that money girllll!! ");
			}else if ( gender == 'M' && rich) {
				System.out.println("You are boy and rich! Live your life!");
			
			} else if (gender == 'F' && !rich) {
				System.out.println("You are girl and poor... Now worries find a sugar-daddy, honey >_< ");
			
			}else if (gender == 'M' && !rich) {
				System.out.println("You are a boy and poor... Oh noo you need to work hard!");
				
			} else {
				System.out.println("Invalid gender or wealth");
			}
		}
	}

