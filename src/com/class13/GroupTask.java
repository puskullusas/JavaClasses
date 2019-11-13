package com.class13;

import java.util.Scanner;

public class GroupTask {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

//  7.Write a java program to check whether a given number is prime or not?
		
//		A prime number is a natural number greater than 1 that cannot be formed
//		by multiplying two smaller natural numbers. A natural number greater than 1 
//		that is not prime is called a composite number. For example, 
//		5 is prime because the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself.
		int num;
		System.out.println("Enter the positive integer:");
		num = input.nextInt();
		boolean flag = true;
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				flag = false;
				break;
			}
		}
		if (flag&& num >1) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
//		6.	Write a Java Program to find whether a String is palindrome or not?
//		A palindrome is a word, number, phrase, or other sequence of characters 
//		which reads the same backward as forward, 
//		such as taco cat or madam or racecar or the number 10801
		String word = "racecar";
		//palindrome or not
		//convert string to array of charachters
		char[]plndrm=word.toCharArray();
		for (char i: plndrm) {
			//System.out.println(i);
			//int size = plndrm.length;//7
			//System.out.print(size);
			}
		//want to print the string backwards
	//	int size = plndrm.length;
		for(int i=plndrm.length-1; i>=0;i--) {
		System.out.println(plndrm[i]);
		
		
	}

}}
