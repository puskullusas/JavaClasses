package com.syntax.review;

public class task2 {
	public static void main(String[] args) {
		// Write a program that prints out if it is good weather to go for a bike ride.
		// The weather is good if the temperature is between 60 degrees and 100 degrees
		// inclusive unless it is raining. If temperature is less than 60 program should
		// say
//	it is too cold, if the temperature is more than 100, program should say it is too hot.
		/*
		 * If the temperature is between 40 degrees and 80 degrees inclusive & no
		 * rain--> we will go for hiking otherwise--> we will not go hiking If
		 * temperature is between 25 and 40 inclusive & snowing -->going snowboarding
		 * otherwise we are not going snowboarding it if temperature is more than 80 &
		 * sunny--> go to the beach otherwise --> not go to the beach
		 */

		boolean weather = true;
		boolean noRain = true;
		boolean snow = false;
		boolean sun = true;
		int temp = 65;
		
		System.out.println("Is weather good for a bike ride?");

		if (noRain) {
			if (temp >= 60 && temp <= 100) {// 65
				System.out.println("The weather is good");
			}if (temp > 40 && temp <= 80) {// true 65
				System.out.println("we will go hiking");
			} else {
				System.out.println("we will not go hiking");
		}
		if (temp < 60) {// false
			System.out.println("too cold");
		} else if (temp > 100) {// false
			System.out.println("too hot");
		}
		
		}

		if (snow) {// false
			if (temp >= 25 && temp <= 40) {// false
				System.out.println("going snowboarding");
			} else {
				System.out.println("no snowboarding");
			}
		}
		if (sun) {
			if (temp > 80) {
				System.out.println("we will go to the beach");// false
			} else {
				System.out.println("we won't go to the beach"); // true

			}
		}

	}
}
