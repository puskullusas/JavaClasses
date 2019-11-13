package com.Class15;

import java.util.Scanner;

public class NewClass {

	public static void main(String[] args) {
		/*ask user to enter brower
		 * your selected browser is...
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter browser name");
		String browser= input.nextLine();
		switch (browser.toLowerCase()) {
		case "firefox": //cases should match the manip method, meaning they must be in lower case in this code
			System.out.println("Execution will be performed on " + browser); //output will be in original form what user entered, cause it was not reassignde
			
			break;
		case "chrome":
			System.out.println("Execution will be performed on " + browser);
			break;
		case "ie":
			System.out.println("Execution will be performed on " + browser);
			break;
		case "safari":
			System.out.println("Execution will be performed on " + browser);
			break;
			default:
				System.out.println("Please enter valid browser");
	}}

}
