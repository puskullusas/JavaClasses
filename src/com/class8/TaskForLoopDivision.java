package com.class8;

import java.util.Scanner;

public class TaskForLoopDivision {
	public static void main(String[] args) {

		// print numbers from 1 to 50 except those
		// divisible by 3

		/*
		 * for (int i=1; i<=50; i++) {
		 * 
		 * if (i%3==0) { continue; } System.out.println(i);
		 */

		Scanner input = new Scanner(System.in);
		// System.out.println("Do you want to apply for CC");
		// String positive = input.nextLine();

		for (int cC = 1; cC <= 5; cC++) {
			System.out.println("Do you want to apply for CC");
			String positive = input.nextLine();
			if (positive.equals("yes")) {
				break;
			}
		}
	}
}
