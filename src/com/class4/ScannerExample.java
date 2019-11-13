package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		// scanner is a class in Java that will allow us to take an input from a user.
		// scanner helps us make a program more interactive
		Scanner sup = new Scanner(System.in); // System.in - keyboard input
		System.out.println("Please enter any number");
		/*
		 * nextInt(); for numbers nextLine(); for Strings nextDouble (); for Double
		 * values
		 */
		int number = sup.nextInt();
		System.out.println("You entered the " + number);

		//2.
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter you name");
		String name = input.nextLine();
		System.out.println("Good Afternoon " + name);
		//3.
		//ask user to enter 2 numbers and then compare
		// which is larger
		Scanner keyb = new Scanner (System.in);
		System.out.println("Please enter first number");
		int num1=keyb.nextInt();
		
		System.out.println ("Please enter second number");
		int num2=keyb.nextInt();
	
		if (num1>num2) {
			System.out.println(num1 + "is larger than " +num2);
		}else if (num1==num2) {
			System.out.println(num1+ " is equal " + num2);
		}else {
			System.out.println(num1 + "is smaller than " +num2);
		}
		
	}

}