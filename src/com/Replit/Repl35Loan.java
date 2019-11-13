package com.Replit;

import java.util.Scanner;

public class Repl35Loan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Do you need a loan?");
		boolean loan = input.nextBoolean();
		String eligibility="";
		if (loan) {
			System.out.println("What is your credit score?");
			int score = input.nextInt();
			
			if (score < 600) {
				eligibility = "Not eligible";// System.out.println ("Not eligible");
			} else if (score > 600 && score <= 700) {
				eligibility = "Maybe eligible";// System.out.println ("Maybe eligible");
			} else if (score > 700 && score <= 800) {
				eligibility = "Eligible";// System.out.println ("Eligible");
			} else {
				eligibility = "Definitely eligible";// System.out.println ("Definitely eligible");
			}
		} else {
			
			System.out.println("Unknown");
		}
		
		System.out.println("The eligibility is " + eligibility);

	}	}

