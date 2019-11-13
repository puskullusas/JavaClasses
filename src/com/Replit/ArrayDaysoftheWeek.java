package com.Replit;

import java.util.Scanner;

public class ArrayDaysoftheWeek {
public static void main (String [] args) {
	Scanner input = new Scanner (System.in);
	String[] arr = new String[7];

	for (int i = 0; i <arr.length; i++) {

		System.out.println("Please enter day " + (i+1) + " of the week");
		arr[i] = input.next();
	}
	
	for(int i=0; i<=arr.length-1; i++){
		System.out.println(arr[i]);
}
	
	//another way
	
	for (int a = 1; a<=7; a++){
		  System.out.println ("Please enter day " + a + " of the week");
		  String user = input.nextLine();
		}
		System.out.println();
		String days[] = {"Sunday", "Monday","Tuesday", "Wednesday", 
		"Thursday", "Friday", "Saturday"};
		for (int b = 0; b<days.length; b++){
		  System.out.println (days[b]);
}}}
