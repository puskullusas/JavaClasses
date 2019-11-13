package com.class2;
// to attach any value (int,String, char, boolean) to a String we use (+) -> concatenation operator
public class StringConcatenation {

	public static void main(String[] args) {
	String name = "sAnna";
	//Display in console Good morning Anna
	System.out.println ("Good morning" + name);
	
	int day =22;
	//Today is Sep 22
	System.out.println ("Today is September " + day + ".");
	String text = "Today is September ";
	System.out.println (text + day);
	
			System.out.println ("My name is " + name); 
	int num1 = 12;
	int num2 = 13;
	// the value of num1 =_ and the value of num2 = _
	System.out.println ("The value of num1=" + num1+
						"and the value of num2=" +num2);
	
	String fruit = "banana";
	char dollar = '$';
	double price = 1.99; 
	//the price of banana $1.99
	
	System.out.println ("The value of " + fruit + " is "
			+ dollar + price);
//
	}

}
