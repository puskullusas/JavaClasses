package com.class9;

public class DollarExampleAndReverse {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j == 1 || i == 4 || j == 5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("___________________");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			}
			for (int k =1; k<=i;k++) {
			System.out.print(i);
		 	}
			System.out.println();
}}}
