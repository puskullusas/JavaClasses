package com.class6;

public class Recap5 {
public static void main (String [] args) {
	int time = 23;
	String timeOfTheDay;
	
	if (time >=1 && time <=11) {
		timeOfTheDay = "Morning";
	}else if (time>=12 && time <=15) {
		timeOfTheDay = "Noon";
	}else if (time>=16 && time <=20) {
		timeOfTheDay = "Evening";
	}else if (time>20) {
		timeOfTheDay = "Night";
	}else {
		timeOfTheDay = "Invalid";
	}
	System.out.println(timeOfTheDay);
	
	if (timeOfTheDay.equals("Morning")) {
		System.out.println("Good Morning");
	}
	
}
}
