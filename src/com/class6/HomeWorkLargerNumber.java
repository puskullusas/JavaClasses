package com.class6;

import java.util.Scanner;

public class HomeWorkLargerNumber {
	public static void main(String[] args) {
		/*
		 * 1. Write a program to find largest of three double values using if-else..if
		 * and logical operators provided by a user (numbers must be distinct)
		 */
		double val;
		val = 100000;

		if (val == 60_000) {
			System.out.println("The number is small");
		} else if (val == 86_000) {
			System.out.println("The number is medium");
		} else if (val == 100_000) {
			System.out.println("This is the largest number");
		}
		/*
		 * 2. Program to find largest number among three numbers using nested if
		 * provided by a user (numbers must be distinct)
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number");
		double num = input.nextDouble();

		if (num >= 18000 && num <= 100000) {
			if (num >= 18000 && num <= 45000) {
				System.out.println("The number is small");
			} else if (num > 45000 && num < 100_000) {
				System.out.println("This is the med number");
			} else if (num == 100_000) {
				System.out.println("The largest number");
			}
		} else {
			System.out.println("Number is out of range");
		}
		// another way
		// TASK 2 find the largest number using nested if
		System.out.println("Please enter 3 distinct numbers for Nested If Task");
		double no1 = input.nextDouble();
		double no2 = input.nextDouble();
		double no3 = input.nextDouble();
		//if (no1!=no2 ||no2!=no3) {
		if (no1 > no2) {
			if (no1 > no3) {// no1>no2 && no1>no3
				System.out.println("Largest number is first - " + no1);
			} else {// no1>no2 but no1<no3
				System.out.println("Largest number is third - " + no3);
			}
		} else {// assuming no2>no1
			if (no2 > no3) {// no2>no1 && no2>no3 --> no2 =largest
				System.out.println("Largest number is second - " + no2);
			} else {// no2>no1 but no2<no3
				System.out.println("Largest number is third - " + no3);
			}
		}
	//}else { 
	//	System.out.println("Numbers are equal");
}}
