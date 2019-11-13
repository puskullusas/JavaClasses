package com.class9;

import java.util.Scanner;

public class InputIngandSum {
	public static void main(String[] args) {
//		Write a program that reads a range of 
//		integers (start and end point), provided by a 
//		user and then from that range prints the 
//		sum of the even and odd integers.
		Scanner input = new Scanner(System.in);
		int user = 0;
		int even = 0;
		int odd = 0;
		for (int a = 1; a <= 3; a++) {
			System.out.println("Input an integer");
			user = input.nextInt();// for ex. 1st input = 2;
			// 'user' holds the current value, and changes with new input
			// int sum=0;//sum=sum+user;//to save current 'user' input, this can be used
			if (user % 2 == 0) {
				even = even + user;// 1st iteration even = 0, becomes 2;
									// 2nd iteration, even =2; becomes 4;
			} else {
				odd = odd + user;
			}
		}
		System.out.println(even);
		System.out.println(odd);

		// Another ways bringing range
		
		System.out.println("Enter start number");
		int start = input.nextInt();
		System.out.println("Enter end number");
		int end = input.nextInt();
		int sum = 0;
		int even2 = 0;
		int odd2 = 0;
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				even2 = even2 + i;
			} else {
				odd2 = odd2 + i;
			}
		}
		System.out.println(even2);
		System.out.println(odd2);

		// another way with if else condition
		
		System.out.println("Enter start number");
		int firstNumber = input.nextInt();
		System.out.println("Enter ending number");
		int secondNumber = input.nextInt();

		int start1 = 0;
		int end1 = 0;

		if (firstNumber < secondNumber) {// if the user enters 'starting number' larger than 'end number'
			start1 = firstNumber; // 'if condition' will allow to work 'for loop' properly
			end1 = secondNumber;
		} else {
			start1 = secondNumber;
			end1 = firstNumber;
		}
		int even1 = 0;
		int odd1 = 0;
		for (int i = start1; i <= end1; i++) {
			if (i % 2 == 0) {
				even1 = even1 + i;
			} else {
				odd1 = odd1 + i;
			}
		}
		System.out.println("The sum of even numbers is " + even1);
		System.out.println("The sum of odd numbers is " + odd1);
	}
}
