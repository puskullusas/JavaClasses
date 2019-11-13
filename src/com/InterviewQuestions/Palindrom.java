package com.InterviewQuestions;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// if reversed string and original string are equal, it is palindrom
		// Step 1; reverse the string;
		// compare 2 strings
		String word, b = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string you want to check:");
		word = input.nextLine();
		int size = word.length();
		for (int i = size - 1; i >= 0; i--) {
			b = b + word.charAt(i);
		}
		if (word.equalsIgnoreCase(b)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not palindrome.");
		}
//another way usin toCharArray

		System.out.print("Please enter a string: ");
		String str = input.nextLine();

		// for ex String str="radar";

		char[] arr = str.toCharArray();//toCharArray method will extract characters
		//and store them into char[]arr as Array of Strings

		String reverse = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			reverse = reverse + arr[i];
		}

		if (str.equals(reverse)) {
			System.out.println(str + " is a palindrome word.");
		} else {
			System.out.println(str + " is NOT a palindrome word.");
		}
	}
}
