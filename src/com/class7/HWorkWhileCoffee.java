package com.class7;

import java.util.Scanner;

public class HWorkWhileCoffee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * you need to ask user to pay for coffee you need to keep asking user to pay
		 * for it until entered price is 5; after paid -> say "Enjoy your coffee/apples"
		 */
		// 1111111111111111111111111111111111111111111111111111111111
		// This Program executes until exact number (5) is entered! he can try his
		// chance 4 times
		int payment;
		int inpControl = 1; // to limit the attempt to 4 times
		System.out.println("Please pay for your coffee");
		payment = input.nextInt();

		while (inpControl < 4) {
			if (payment == 5) {
				System.out.println("Enjoy your coffee");

			} else {
				System.out.println("Not the right amount");
				System.out.println("Please provide exact change");
				payment = input.nextInt();
				inpControl++;
			}
		}
		System.out.println("Go get more money"); // will be executed when while condition true;

// 2222222222222222222222222222222222222222222222222222222222
		// ANOTHER WAY
		System.out.println("Please enter exact change to pay for apples");
		int price1 = input.nextInt();
		while (price1 < 5) {
			System.out.println("Exact change please!");
			price1 = input.nextInt();
		}
		System.out.println("Enjoy your apples");

// 33333333333333333333333333333333333333333333333333333333333333
// DO WHILE DO WHILE DO WHILE DO WHILE DO WHILE DO WHILE DO WHILE DO WHILE

//The customer should give exact change = 5
		int money;
		do {
			System.out.println("Pay for your apples");
			money = input.nextInt();
		} while (money < 5 || money > 5);
		System.out.println("Enjoy!Should i keep the change?");

// DO WHILE ANOTHER WAY/WHILE LOOP IS WORKING AS LONG AS IT IS TRUE

		int mon;
		do {
			System.out.println("Please enter exact price");
			mon = input.nextInt();
		} while (mon != 5);
		System.out.println("You've given 5$! Enjoy!");
	}
}
