package com.syntax.review;

public class Task2a {
	public static void main(String[] args) {
		// Write a program that prints out if it is good weather to go for a bike ride.
				// The weather is good if the temperature is between 60 degrees and 100 degrees
				// inclusive unless it is raining. If temperature is less than 60 program should
				// say
//					it is too cold, if the temperature is more than 100, program should say it is too hot.
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
		int temp = 95;
		
		System.out.println("Is weather good for a bike ride?");
		// 65
		if (temp >= 60 && temp <= 100) {// 65
			if (noRain) { // true
				System.out.println("The weather is good");
			}
		} else if (temp < 60) { // false will not go in
			System.out.println("too cold");
		} else if (temp > 100) { // false DID NOT GO IN
			System.out.println("too hot");
		}

		if (temp > 40 && temp <= 80) {// 65 //will go in
			if (noRain) { // true
				System.out.println("we will go hiking");//will print
			} else { // false
				System.out.println("we will not go hiking");//will not go in no print
			}

			if (temp >= 25 && temp <= 40) { // false not in range//should not go in
				if (snow) { // true
					System.out.println("going snowboarding");
				} else {
					System.out.println("no snowboarding");
				}

				if (temp > 80) { // false <80//should not go in
					if (sun) {
						System.out.println("we will go to the beach");// false
					} else {
						System.out.println("we won't go to the beach"); // true

					}
				}
			}
		}
	}
}
