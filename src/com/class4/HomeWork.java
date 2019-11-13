package com.class4;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		
		Scanner console = new Scanner (System.in); //you create this once in the whole program 
				/*  int age=10;
				 * System.out.println ("What is your age?"); 
				 * int age  =console.nextInt(); 
				 * int after = age+10; 
				 * System.out.println ("Your age after 10 years is "+after);
				 */
		// _______________________________
		// #27
		// The variable "name" holds a STRING user input
		// Write a conditional statement starting on line 9 that does the following:
		// If name is equal to "Chen", print "teacher"
		// For any other input, print "student"
		// ___________________________
		/*
				 * System.out.print("In:"); 
				 * String name = inp.nextLine(); 
				 * if (name.equals ("Chen")) { 
				 * System.out.println("teacher's name is Chen"); 
				 * } else {
				 * System.out.println("student");}
				 */
		// __________________________________
		// #25
		// Create a program that will take a BOOLEAN value from a user.
		// If the input is True or False, then the output should look like below:
		// First Output: "Input the boolean value"
		// Final Output: "The value is ______"
				/*
				 * System.out.println ("Input the boolean value"); 
				 * String bool = console.nextLine(); 
				 * boolean val = console.nextBoolean(); 
				 * if (val){
				 * System.out.println ("The value is " + val); 
				 * }else{ System.out.println ("The value is " + val); }
				 */
		// Write a Java program to ask the user "Please enter your age".
		// Then the program will show if the person is eligible to vote.
		// A person who is eligible to vote must be older than or equal to 18
		// years old and the program will show "You are eligible to vote".
		// Otherwise the program will show "You are not eligible to vote".
		/*
				 * System.out.println ("Please enter your age"); 
				 * int age = console.nextInt(); 
				 * if (age>=18){ 
				 * System.out.println ("You are eligible to vote"); 
				 * }else {
				 * System.out.println ("You are not eligible to vote"); }
				 */
		
		/*System.out.println ("Please enter the length");
		  int l = console.nextInt();
		  System.out.println ("Please enter the width");
		  int w = console.nextInt();
		  if (w==16){
		    if (l==18){
		    System.out.println ("The shape of your object is rectangle");
		  }else if (l==16){
		    System.out.println ("The shape of your object is square");
		} else {
			System.out.println("Idk what shape is this");
		}		  }*/
	}
	}

