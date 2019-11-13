package com.class6;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		// NO RELATIONAL OPERATORS CAN BE USED
		// NO DOUBLE, BOULEAN, LONG
		// ONLY CHECKS EQUALITY
		// LOGICAL OPERATORS CANNOT BE USED
		// ONLY WORKS WITH BYTE< INT<SHORT<CHAR <STRING
		
		
		int day = 3;
	//	String weekDay;
		switch (day) {// day==1
		case 1:
			System.out.println("Monday");// weekDay = "Monday";
		break;
		case 2:
			System.out.println("Tuesday"); //weekDay = "Tuesday";
		break;
		case 3:
			System.out.println("Wednesday");//weekDay = "Wednesday"; 
	break;
		case 4:
			System.out.println("Thursday");//weekDay = "Thursday";
	break;
		default:
			System.out.println("Invalid");//weekDay = "Invalid";
			break;
		}
		// System.out.println(weekDay);

		/*Scanner input = new Scanner (System.in); String name = input.nextLine();
		 switch (name){ 
		 case "Caleb":
			 System.out.println("Hey my man"); 
			 break;
		 case"Clare":
			 System.out.println("Go away"); 
		 break;
		 default:
		 System.out.println("Try again later"); 
		 break;
		 }*/
	}
}
