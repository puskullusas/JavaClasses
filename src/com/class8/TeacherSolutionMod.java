package com.class8;

public class TeacherSolutionMod {
	public static void main(String[] args) {

		// teacher resolution
		int sumEven = 0;
		int sumOdd = 0;
		for (int b = 1; b <= 20; b++) {
			if (b % 2 == 0) {
				sumEven = sumEven + b;
			} else {
				sumOdd = sumOdd + b;
			}
		}
		System.out.println("total is " + sumEven);
		System.out.println("total is " + sumOdd);
	}
}
