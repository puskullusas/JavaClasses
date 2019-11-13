package com.Class12;

public class JavaQuizz2 {

	public static void main(String[] args) {
		
		int nums[] = { 12, 15, 16, 17, 19 };
		   for (int i = nums.length-1; i >0; i--) {
		      System.out.println(nums[i]); // => output 19,17,16,15
		   }
		 		
		char array_variable [] = new char[10];
		for (int i = 0; i < 10; ++i) {
		         array_variable[i] = 'i';
		         System.out.print(array_variable[i] + " ");//output=> iiiiiiiiii
		}
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );// zip[3]=> output => 1
		
}}
