package com.class6;

import java.util.Scanner;

public class SwitchHW {
	public static void main(String[] args) {
		Scanner uInput = new Scanner(System.in);
		/*1
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		
		/*System.out.println("Please name the country");
		String country = uInput.nextLine();
		String language;

		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;
		case "Japan":
			language = "Japanese";
			break;
		case "Russia":
			language = "Russian";
			break;
		default:
			language = "There is no such language";
			break;
		}
		System.out.println(language);*/
	
	/*
	 * 2 Allow user to enter grade and then provide explanation: A-Excellent,
	 * B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At the end your
	 * program should print which grade was entered by a user with explanation.
	 */
	
	/*System.out.println ("Please enter grade");
	String grade = uInput.nextLine();
	String expl;
	switch (grade) {
	case "A":
		expl = "Excellent";
		break;
	case "B":
		expl = "Good";
		break;
	case "C":
		expl = "Average";
		break;
	default:
		expl = "Not acceptable";
		break;
		
}
	System.out.println("Your grade is " + grade + " which is " + expl);*/
	
	/* 3. HomeWork: Using scanner class create calculator. Allow user to enter 2
	 * numbers and operator(+,-,*,/). Based on operator provide the result to user.*/
	
	System.out.println("Enter number");
	int num = uInput.nextInt();
	System.out.println("Enter oper");
	char oper = uInput.next().charAt(0);
	System.out.println("Enter number");
	int num1 = uInput.nextInt();
	int total;
	
	 switch (oper) {
	 case '+':
		total = (num+num1);
		break;
	 case '-':
		 total = (num-num1);
		 break;
	 case '*':
		 total = (num*num1);
		 break;
	 case '/':
		 total = (num/num1);
		 default:
			 total = 0;
	}
	System.out.println(total);
	}
	
	
	}
