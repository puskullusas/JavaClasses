package com.extraExercise;

import java.util.Scanner;

public class WhileLoopChoice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = 1;
		while (choice == 1) {

			int a;

			System.out.println("Enter a number to check odd or even");
			a = input.nextInt();

			if (a % 2 == 0) {
				System.out.println("Your number is even");
			}

			else {
				System.out.println("Your number is odd");
			}

			System.out.println("Want to check more 1 for yes 0 for no");

			choice = input.nextInt();

		}

		System.out.println("I hope you checked all your numbers");

	}
}
