package com.syntax.review;

public class logicOpTask {
	public static void main (String [] args) {
		
		//Write a program to find if a number is even or odd 
	       //Print out  "My number must be even" or "My number must be odd" 
	        // Must use if else
		
		int num = 40;
		if (num%2==0) {
			System.out.println("My number must be even");
      }	else {
    	  System.out.println("My number must be odd");
      }
		//Write a program to find if the largest Number of three numbers
	       //Print out  System.out.println("Largest number is " + largestNumber);
	        // Must use if then a else if and lastly else 
	
		int a, b, c;
		a=1;
		b=2;
		c=3;
		
			if (a>b && a>c) {
            System.out.println("Largest number is "+a);
        }else if (b>c && b>a) {
            System.out.println("Largest number is "+b);
        }else {
            System.out.println("Largest number is "+c);
	}
	}}
