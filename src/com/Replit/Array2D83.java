package com.Replit;

public class Array2D83 {

	public static void main(String[] args) {

		int[][] a = { { 5, 2, 3, 7 }, { 1, 5, 2, 2 }, // 10
				{ 1, 2, 3, 4 } };
		int sum = 0;
		for (int b = 0; b < a[2].length; b++) {
			sum = sum + a[2][b];
		}
		System.out.println(sum);// 10
		System.out.println("_______________");

//another way
		int row = 2;
		int total = 0;
		for (int j = 0; j < a[row].length; j++) {
			total = total + a[row][j];
		}
		System.out.println(total);
		System.out.println("_____________________");
//print sum of each row REPL86
		int[][] nums = { 
				{ 1, 1, 2 }, //0// sum = 4
				{ 3, 1, 2 }, //1// sum = 6
				{ 3, 5, 3 }, //2// sum = 11
				{ 0, 1, 2 } //3//  sum = 3
		};
		int sums[] = new int[nums.length]; // = 4 rows
		for (int i = 0; i < nums.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < nums[i].length; j++) {
				rowSum += nums[i][j];
			}
			System.out.println("The sum of row " + i +" : "+ rowSum);
//			sums[i] = rowSum;
//		}
//			for (int sum1 : sums) {
//			System.out.println(sum1);
		}
	}}
