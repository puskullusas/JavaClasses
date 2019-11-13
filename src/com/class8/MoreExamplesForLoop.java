package com.class8;

public class MoreExamplesForLoop {
	public static void main(String[] args) {

		int total = 2;
		for (int y = 1; y <= 3; y++) {
			total = total * y;
		}
		System.out.println(total);
		System.out.println("********************");

		int sumAll = 0;
		for (int i = 0; i <= 20; i += 5) {
			sumAll = sumAll + i;
		}
		System.out.println(sumAll);
	}

}
