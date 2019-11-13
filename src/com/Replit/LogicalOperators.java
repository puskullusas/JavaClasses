package com.Replit;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {

		/*
		 * For you to do: Declare 4 int variables a, b, c and d. Your variable c is the
		 * result of addition of a & b. Variables a & b should be more than d, and c
		 * should be more than d.
		 * 
		 * Output: true true
		 * 
		 * Hint: you have 2 outputs meaning you need to have 2 printing statements
		 */
		int a, b, c, d;
		a = 7;
		b = 8;
		d = 5;
		c = a + b;

		if (a > d && b > d) {
			System.out.println("true");
			if (c > d) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		} else {
			System.out.println("false");
		}// other way;
		int a1=15;  
		int b1=20;  
		int c1=a+b; 
		int d1=12;
		System.out.println(a1>d1&&b1>d1);
		System.out.println(c1>d1);
	
  
	}
}
		

