package com.Replit;

import java.util.Scanner;

public class Manip97Strings {

	public static void main(String[] args) {
		
//		Using Scanner class input string value. 
//		Print out the following: "The first 3 letters of ___ is ___"
//		For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
		
		Scanner a=new Scanner(System.in);
	    String ab=a.nextLine();
	    System.out.println("The first 3 letters of "+ab+ " is "+ ab.substring(0,3));
	   

	}

}
