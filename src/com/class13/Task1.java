package com.class13;

import java.util.Scanner;

public class Task1 {
public static void main (String [] args) {
	
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the day of the class:");
	String day = input.nextLine();
	if (day.trim().toLowerCase().equals("saturday")) {
		System.out.println("On Saturdays you have Java");
	}else if (day.equalsIgnoreCase("sunday")) {
		System.out.println("Sunday is your GIT class");
	}else if (day.toUpperCase().equals("TUESDAY")) {
		System.out.println("Tuesdays is your SDLC");
	}else if (day.equals("thursday")) {
		System.out.println("Thursdays is manual testing");
	}else {
		System.err.println("Please enter valid day");
	}
	input.close();//to stop using scanner
}
}
