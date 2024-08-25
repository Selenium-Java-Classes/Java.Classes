package com.neotech.lesson02;

public class PrimitiveDataType {
	
	public static void main(String[] args) {
		
		// Byte can have a value between -128 and 127
		// Data Type   name/identifier    operator(=)   value;
		    byte         age                  =          29;
		    byte temprature = -15;
		    
		    
		    short distance = 1500;
		    // between 0 to 65535
		    // 3 can also fit in byte, but if I want to assign something more than 127 later, byte will NOT work.
		    short seconds = 3;
		    System.out.println(seconds);
		    
		    
		    int number = 85000;
		    // between -2147483648 to 2147483648
		    int number2 = 5;
		    
		    
		    long longNumber = 4393749923879473898L;
		    //huge to hugeeee numbers
		    //When you put L in the end of the number, it means huge(long) number
		    long longNumber2 = 6L;
		    //if you know the number will be MORE THAN 2 billion use long.
		    
		    
		    // !! How would I decide between any of these data types for number?
		    // !! What are the possible values(ranges) of your variables?
		    // !! For the answer of these questions, you suppose to know the range.
		    
		    // What about storing decimals?
		    // for this we have: double and float
		    double doubleNumber = 25.5468273893;
		    // For double if you write a lot numbers, it will print all of the number you put.
		    float floatNumber = 25.54672673F; 
		    // !! Float has F in the end of the number. So, you can separate it from the double.
		    // For float if you write more than 6 number after the dot, it will print only 6 numbers.
		    
		    System.out.println(floatNumber); 
		    System.out.println(doubleNumber);
		    
		    // Character definition
		    // if it is inside double quotes (") = string
		    String firstString = "S";
		    // if it is inside one quotes (') = char
		    char firstCharacter = 'R';
		    char dollar = '$';
		    char three = '3';
		    char space = ' ';
		    // one space is also character.
		    
		    boolean isRaining = false;
		    // it accepts true or false
		    System.out.println(firstCharacter);
		    System.out.println(dollar);
		    System.out.println(three);
		    System.out.println(space);
		    System.out.println(isRaining);
		    
		    
		    //Variable names should be logical names. They should be make sense.
		  
		    
	}
	

}
