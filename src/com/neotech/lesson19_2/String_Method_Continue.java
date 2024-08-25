package com.neotech.lesson19_2;

public class String_Method_Continue {

	public static void main(String[] args) {

		//contains()
		
		String sentence = "Hope is what you live for!";
		boolean response = sentence.contains("Hope");
		//same as saying --> does the String sentence contain this element? Yes/No (true/false)
		System.out.println(response);

		//How would I check if I want to ignore case???
		
		System.out.println(sentence.toLowerCase().contains("hope"));
		//I could do this in two lines
//		String lower = sentence.toLowerCase();
//		boolean check = lower.contains("hope");
		
		//equals()
		String s1 = "Tuesday";
		String s2 = "tuesday";
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		
		//equalsIgnoreCase()
		boolean equals2 = s1.equalsIgnoreCase(s2);
		System.out.println(equals2);
		
		
		
		//instead of equalsIgnoreCase(), I could do this:
		
		boolean equalsUsingLower = s1.toLowerCase().equals(s2.toLowerCase());
		System.out.println(equalsUsingLower);
		//step by step
		
		String s1Upper = s1.toUpperCase();
		String s2Upper = s2.toUpperCase();
		boolean compare = s1Upper.equals(s2Upper);
		System.out.println(compare);
		
		//startsWith()
		boolean starts = sentence.startsWith("Hope");
		System.out.println("Does it start with Hope? " + starts);
		
		boolean ends = sentence.endsWith("for!");
		System.out.println("Does it end with for!? " + ends);
		
		
		}
}
