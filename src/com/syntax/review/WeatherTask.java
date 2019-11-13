package com.syntax.review;

public class WeatherTask {
	public static void main (String [] args) {
	// 	Write a program that prints out if it is good weather to go for a bike ride.
	// The weather is good if the temperature is between 60 degrees and 100 degrees
	// inclusive unless it is raining. If temperature is less than 60 program should
	// say
	// it is too cold, if the temperature is more than 100, program should say it is
	// too hot.
	/*
	 * If the temperature is between 40 degrees and 80 degrees inclusive & no
	 * rain--> we will go for hiking otherwise--> we will not go hiking If
	 * temperature is between 25 and 40 inclusive & snowing -->going snowboarding
	 * otherwise we are not going snowboarding it if temperature is more than 80 &
	 * sunny--> go to the beach otherwise --> not go to the beach
	 */

	int temp=85;
	boolean rain,snow,sunny;
	snow=false;
	rain=false;
	sunny=true;
	
	if(temp>=40&&temp<80) {
		if (temp < 60) {
			System.out.println("whether is cold");
		} else {
			System.out.println("wheather is good");
		} ///////////////////////
		if (rain) {
			System.out.println("we will go for hiking");
		} else {
			System.out.println("we will not go hiking");
		}
	}else if(temp>=25&&temp<40)
	{

		System.out.println("whether is cold");
		if (snow) {
			System.out.println("going snowboarding");
		} else {
			System.out.println("we are not going snowboarding");
		}
	}else if(temp>80) {

		if (temp > 100) {
			System.out.println("it is too hot");
		} else {
			System.out.println("Wheather is good");
		}
		if (sunny) {
			System.out.println("go to the beach");
		} else {
			System.out.println(" not go to the beach");
		}

	}

}}