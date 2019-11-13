package com.class8;

public class NestedLoops {
public static void main (String[] args) {
	// nested if - loop inside loop
	//print multiplication table of integers 12, 13, 14
	
	int i;
	int j;

	 for(i = 12;i<=14;i++){/*outer loop*/

	   System.out.println("Table of " + i);

	   for(j = 1;j<=10;j++){/*inner loop*/

	     System.out.println(i+"*"+j+" = "+(i*j));

		}
	}
}
}
