package com.class4;

import java.util.Scanner;

public class ScannerExercises {

	public static void main(String[] args) {
		//Scanner consoleInput = new Scanner(System.in);
		// System.out.println("How much money do you want");
		// int needed = consoleInput.nextInt();

		// System.out.println ("Please enter second number");
		// int num2=keyb.nextInt();

		// if (needed < 200_000) {
		// System.out.println("I will lend you the money");
		// }else if (num1==num2) {
		// System.out.println(num1+ " is equal " + num2);
		// } else {
		// System.out.println("Sorry, we will not lend you any money");
		// }
		// 2.
		/*Scanner age = new Scanner(System.in);
		System.out.println("How old are u?");

		int input = age.nextInt();
		if (input >= 18) {
			System.out.println("I can issue a drivers license to u");
		} else {
			System.out.println("You should get a learners permit");
		}*/
 //3.Ask user to input city and temperature;convert Fahrenheit into Celsius, print. the t of the city_ is_
		//C=(F-32)*5/9 formula to convert
		
		Scanner consoleInput = new Scanner(System.in);//created Scanner object connected 
													//	to the console (System.in)
		
		System.out.println("Which city?");
		String city = consoleInput.nextLine();//input from user
			
		System.out.println("What temperature is it there?");
		int temp = consoleInput.nextInt();
		
		consoleInput.close();
		int C = (temp-32)*5/9;	
		System.out.println ("The temperature of the city " + city + " is " + C + "°C");
		
	}

}