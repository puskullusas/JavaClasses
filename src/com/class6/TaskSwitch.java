package com.class6;

import java.util.Scanner;

public class TaskSwitch {
	public static void main(String[] args) {

		/*
		 * ask user where they are from, specify country and based on that favorite food
		 */

		String country, foodName;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		country = scan.nextLine();

		switch (country) {

		case "Turkey":
			foodName = "kebab";
			break;
			
		case"Ethiopia":
			foodName = "tibs";
			break;
			
		case "Morocco":
			foodName = "Tajin";
			break;
		case "Kazakhstan":
		foodName = "Kumis";
		break;
		case "Pakistan":
			foodName = "Briyani";
			break;
		case "Russia":
			foodName = "Caviar";
			break;
		case "Cuba":
		foodName = "Sofrito";
		break;
		default:
			foodName = "Unknown";
			}
		System.out.println("You are from " + country + " and your favourite food is " + foodName);
	}

}
