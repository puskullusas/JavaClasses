package com.class11;

public class ArraysPrintAll {

	public static void main(String[] args) {
		// task
		int arrays[][] = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 } };
		for (int[] elements : arrays) {
			for (int j : elements) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		// sum
		int sum =0;
		for (int i = 0; i < arrays.length; i++) {
			for (int k = 0; k < arrays[i].length; k++) {
				//System.out.print(arrays[i][k] + " ");
			sum=sum+arrays[i][k];
			}
			System.out.println();
		}
		System.out.println("The sum of all elements is " + sum);
	
	// another way
		int sum1 =0;
	for (int nums[]: arrays) {
		for (int getNum:nums) {
			sum1 = sum1+getNum;
		}
	}
	System.out.println("The sum of all elements is " + sum);
	
	}}
