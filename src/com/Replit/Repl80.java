package com.Replit;

import java.util.Scanner;

public class Repl80 {
public static void main (String [] args) {
	
	 Scanner sc = new Scanner (System.in);
	  int a [] = new int [5];
	 for (int i=0; i<5; i++){
		// System.out.println(i);
		a[i] = sc.nextInt();
	  }
		for (int b=0;b<a.length; b++){
		System.out.println (a[b]*10);
		}
		
	}}

