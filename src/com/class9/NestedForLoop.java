package com.class9;

public class NestedForLoop {
	public static void main (String [] args) {
		
		
		for (int i = 1; i<=3; i++) { //outer loop controls repetition of inner loop
			System.out.println("I am inner loop");
			for (int j = 1; j <=3; j++) {
				System.out.println("I am outer loop");
			}
		}
		for (int i = 1; i<=3; i++) { //outer loop controls repetition of inner loop
			System.out.println(i);
			for (int j = 1; j <=3; j++) {
			System.out.println(i + "" + j);
	}

}}}
