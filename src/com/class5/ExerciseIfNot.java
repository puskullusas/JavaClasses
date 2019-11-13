package com.class5;

import java.util.Scanner;

public class ExerciseIfNot {
	public static void main (String [] args) {
/* ask user to enter age
 * if age is from 1 to 3 --> you are a baby
 * if age from 3-5 --> you are a toddler
 * if age from 5-12 --> you are a kid
 * if age form 12-19 --> you are a teenager
 * if age >19 --> you are an adult
 */
	Scanner input = new Scanner (System.in);
	
	System.out.println("Please, enter your age");
	int age = input.nextInt();
	//String human; another way
	if (age >1 && age <=3) {
	System.out.println("You are still a baby"); // human = "baby";// it also assigns value and stores it?
	}else if (age>5 && age <=12) {
		System.out.println("You are a kid"); //human = "kid";
	}else if (age>12 && age<=18) {
		System.out.println("You are a teenager");//human = "teenager";
	}else {
		System.out.println ("You are an adult"); //human = "adult";
								//at the end don't forget to  print //System.out.println("You are " + human);
	}
	
	// import shortcut ctlr+shft+O
	/*ask user to enter daily sales
	 * based on the sales range we want to give commission to the person
	 * if sales are <100 --> commission is 10%
	 * if sales is between 100-200 --> commission is 20%
	 * etc.
	 */
	double salesAmount;
	double commission = input.nextInt();
	System.out.println("Please enter your sales amount");
	 salesAmount = input.nextDouble();
	 if (salesAmount<100) {
		 commission = (salesAmount*0.1);
	 }else if (salesAmount >=100 && salesAmount <200) {
		 commission= (salesAmount*0.2);
	}else if (salesAmount >=200 && salesAmount <500) {
		commission= (salesAmount*0.3);
	}else {
		commission = 0;
		
	 System.out.println("Based on your sales your commission is " + commission);
}}
}
