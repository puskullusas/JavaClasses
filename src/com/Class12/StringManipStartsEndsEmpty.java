package com.Class12;

public class StringManipStartsEndsEmpty {

	public static void main(String[] args) {
		/* This method tests if a string starts with the specified
		 * prefix beginning
		 */
	
		String str2= "It is very hot in the class";
		System.out.println("Is this string starts with " + str2.startsWith("It"));//index 0 is default
		System.out.println("Is this string starts with " + str2.startsWith("is", 3));//compares is to index 3
	System.out.println("_______________________");
	
		//This method tests if this string ends with the specified suffix
		System.out.println("Is this string ENDs with = " + str2.endsWith("class"));
			
		/* this method checks whether a String is empty or not.
		 * this method returns true if the given string is empty, else it returns false
		 */
	String s="";
	System.out.println("Is this string empty= "+s.isEmpty());
	String h = "Hello";
	System.out.println("Is this string empty= "+h.isEmpty());
	// 
	if (!s.isEmpty()) {
		System.out.println("This is not empty");
	}else {
		System.err.println("This is empty string");
	}
	}

}
