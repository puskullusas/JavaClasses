package com.class8;

public class TaskForLoop {
public static void main (String [] args) {
	/*write code to find the sum of even and odd numbers
	 * from 1 to 20
	 * expecting two outputs
	 * sum for odd nums = ...
	 * sum for even nums = ...
	 */
	int sumEven =0;
	int sumOdd=0;
	for (int i = 0; i<=20; i+=2) {
		//if (i%2 == 0) {
			sumEven=sumEven + i;
		  System.out.println("Total is " + sumEven);
		//}else {
	}
		  for (int i =1; i<=20; i+=2) {
			sumOdd=sumOdd + i;
			System.out.println("Total is " +sumOdd);
		}
		
		  }
	}



