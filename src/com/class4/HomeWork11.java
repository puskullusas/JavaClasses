package com.class4;

import java.util.Scanner;

public class HomeWork11 {
	public static void main(String[] args) {
		/*
		 * Create a java program that will ask if user has a credit card or not. If your
		 * user doesn't have a credit card then offer them. If they do have it ask what
		 * is balance on the card. If balance of the card is larger than 1000. tell them
		 * to pay off immediately, otherwise you can tell them that they can spend more.
		 */
		// 
		Scanner console = new Scanner(System.in);
		System.out.println("Do you have a Credit Card?");
		String creditCard = console.next();
		if (creditCard.equals("no")) {
			System.out.println("You can open a Credit Card");
		} else if (creditCard.contentEquals("yes")) {
			System.out.println("What is the balance on the card");
			int balance = console.nextInt();
		    if (balance >= 1000){
			System.out.println ("Pay off immediately");
			}else {
				System.out.println("You can spend more"); 
			}
		}}}
/*Write a program to ask user to enter numbers or worked years and annual salary. If user worked for more
or equals to 5 years. then user is eligible for the bonus, otherwise he is not. Once user is eligible and 
salary is larger than 50000 than bonus = 5000, otherwise bonus = 3000.*/
