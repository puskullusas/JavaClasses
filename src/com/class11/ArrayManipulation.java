package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
//		String[] actualNames = { "John", "Sarah" };
//		Arrays.sort(actualNames); // sorts alphabetically or numberwise
//
//		String[] expectedNames = { "Sarah", "John" };
//		Arrays.sort(expectedNames);
//		String actual = Arrays.toString(actualNames);
//		String expected = Arrays.toString(expectedNames);
//		System.out.println(actual.equals(expected));
//		System.out.println("_______________________");

		int[] num = { 3, 6, 1, 8, 7 };//int [] num = int [5];/ 5 elements inside array
									  //Arrays.sort(num);//numeric sorting inside the loop 
		for (int i: num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("_____");
	}
}
