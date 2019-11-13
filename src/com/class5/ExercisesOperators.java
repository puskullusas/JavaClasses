package com.class5;

import java.util.Scanner;

public class ExercisesOperators {
public static void main (String [] args1) {
	int day = 2;
	if (day==1 || day ==2) {
	System.out.println("It is a weekday");
	} else if (day==3 || day ==4 || day ==5) {
	System.out.println("It is a weekday");
	//or both can fit in if (day >=1 && day <=5){ we have to put && to show range between numbers
	}else if (day==6 || day ==7) {
		System.out.println("It is weekend");
	}else {
		System.out.println("Not a valid day");
	}
	// prompt the user to enter person heights in inches/ Person should be classified as one the 
	//following: short (under 5 feet);
	//	medium (5-6 feet)
	// tall (6 feet and over)
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Please enter your height");
	int height = input.nextInt();
	if (height <5) {
	System.out.println("You are short");
	}else if (height == 5 || height == 6) {
	System.out.println("You are medium");
	}else{
	System.out.println("You are tall");
	
	}
}}


