package com.class8;

import java.util.Scanner;

public class RecapLesson7 {
	public static void main (String [] args) {
	// example//if we don't know how many times it will repeat
		
		Scanner input;
		boolean isRain;
		input = new Scanner (System.in);
		do {
			System.out.println("Is it raining?");
			isRain = input.nextBoolean();	
		
		}while (!isRain);
		System.out.println("We can go to the park");
		}

}
