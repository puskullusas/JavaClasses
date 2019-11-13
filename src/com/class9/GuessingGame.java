package com.class9;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secret = 12;
		int guessNumber = 0;

		do {
			System.out.println("Enter the guess my Number from 1 to 20");
			guessNumber = input.nextInt();
			if (guessNumber < secret) {
				System.out.println("Your number is too small");
			} else if (guessNumber > secret) {
				System.out.println("Your number is too big");
			} else {
				System.out.println("Congrats! You found it!");
			}
		} while (guessNumber != secret);
	}
}