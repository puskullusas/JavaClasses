package com.class7;

public class DoWhileTaskEvenNo {
	public static void main(String[] args) {

		// print even numbers from 20 to 50 using do..while

		int even = 20;
		do {
			System.out.println(even);
			even += 2;
		} while (even <= 50);
		System.out.println("________________________________");

		// another way with mod
		int b = 20;
		do {
			if (b% 2 == 0) {
				System.out.println(b);
			}
			b++;
		} while (b <=50);

	}
}
