package com.class4;

import java.util.Scanner;

public class HWork2 {
	public static void main(String[] args) {
/*Write a java program that prints out True if ( x * y ) return a positive value. Else prints out False if  (x * y) return a negative value. 
Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.
Step 2: Create the if condition to check if the multiplication of x and y values is positive or negative.
Step 3: If it is a positive value - user will get True, if it is negative value - user will get False.
IMPORTANT: Must use a Scanner class*/
		
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter first number");
		int x = console.nextInt();
		System.out.println("Please enter second number");
		int y = console.nextInt();
		int total = x * y;
		System.out.println (total);
		if (total > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}}}
		//OR
		/*	int x,y;
		   Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter first number");
		  x=scan.nextInt();
		  
		  System.out.println("Please enter second number");
		  y=scan.nextInt();
		   
		   if(x*y>0){
		   System.out.println("True");*/







		       