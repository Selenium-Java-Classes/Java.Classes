package com.neotech.lesson08;

public class IncrementAndDecrementOperators {
	public static void main(String[] args) {
		
		int x =5;
		System.out.println(x);
		
		x = x + 1; //Update the value of x by adding 1 to it
		System.out.println(x);
		
		x +=1; //We are updating it using the shorthand operator
		System.out.println(x);
		
		x++; //We call this post-increment because it has plus --> add 1 to x
			//Since we have ++, it adds always 1
		System.out.println(x);
		
		x--; //We call this post-decrement because it has minus --> subtract 1 from x
		System.out.println(x);
		
		int y =10;
		System.out.println(y++); //There are two things happening here!!
								//Print y and increment after
								//The first action is print y
								//The second action is increment it
		System.out.println(++y);
		
		int z = 10;
		int w = z++; //First do the operation and then increment z
		
		System.out.println(z);  //print the incremented value
		System.out.println(w);  //prints the values before the incremented
		
		
		//!!Increment will always increase the value of variable by 1
		//!!Decrement will always reduce the value of a variable by 1
		
//		possible usages:
//		-->   ++a    (pre - increment: before I use a, increase its value by 1)
//		-->   a++	 (post - increment: use a, then increase its value by 1)
//		-->   --a	 (pre - decrement: before I use a, decrease its value by 1)
//		-->   a--	 (post - decrement: use a, then decrease its value by 1)
		
		
		
		
		
		
	}
}
