package com.Replit;

import java.util.Scanner;

public class Repl67 {
public static void main (String [] args) {
	
//	For you to do:
//		You should input:
///		int end;
//		Write a for loop that will print out the numbers starting at 0 and ending at twice of the end variable exclusive.  Each number should be on the same line, separated by a space. 
//		 Sample inputs/outputs:
///		Int: 5
//		0 1 2 3 4 5 6 7 8 9
///		Int: 8
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
///		In: -5
//		(no output) 
	
	 Scanner inp = new Scanner(System.in);
	    System.out.print("Int:");
	    int end = inp.nextInt();
	    
	    for (int start = 0; start<end*2; start++) {
	    	System.out.print(start + " ");
	    }
}
}
