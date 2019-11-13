package com.Replit;

import java.util.Scanner;

public class InstructorName {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);

		String name;
		System.out.println("Enter name of the instructor");
		name = input.nextLine();
		switch (name) {
		case "Shiva":
			System.out.println("Will take care of Java Assignment");
			break;
		case "Sandish":
			System.out.println("Will take care of SDLC Assignment");
			break;
		case "Weqas":
			System.out.println("Will take care of Selenium Assignment");
			break;
		case "Asel":
			System.out.println("Will take care of every Assignment");
			break;
		default:
			System.out.println("Invalid instructor selected");
			break;
		}

	}
}
/*By using the switch statement concept please validate what is the responsibility each instructor in the syntax solution.

First Output: "Enter name of the instructor"

case 1: if User provided the name as Shiva as input it should show  "Will take care of Java Assignment"
case 2: if User provided the name as Sandish as input it should show  "Will take care of SDLC Assignment"
case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"

Other than these four names if user provide the name try to give like (James or John ) " Invalid instructor selected"*/



