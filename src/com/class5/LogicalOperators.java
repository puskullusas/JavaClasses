package com.class5;

public class LogicalOperators {
public static void main (String [] args) {

	
	//Logical Operators: AND (&&), OR (||), NOT
	
	// if (true and true) ==> true;
	//if (true and false) ==> false;
	// if (false and true) ==> false;
	
	
	/*if number is between 1 and 10 --> this number is small
	 * if number is between 10 and 100 --> this number is medium
	 * if number is between 100 and 1000 --> this number is large
	 * any other number--> is out of the range 
	 */
	int num =200;
	
	if (num>1 && num<10) {//AND
		System.out.println("This number is small");
	}else if (num >=10 && num <100) {
		System.out.println("This number is medium");
	}else if (num >=100 && num <1000) {
		System.out.println("This number is large");
	}else {
		System.out.println("This number is out of range");
	}
	//OR
	
	// if (true OR true) ==> true;
	//if (true OR false) ==> true;
	//if (false OR true) ==> true;
	//if (false OR false) ==> false;
	
	/*7 days a week
	* if day is 2 or 4 --> SDLC
	* if day 6 or 7 --> Java Class
	* if day 1 or 5 --> No class
	* if day =3 --> review class*/
	
	int day = 8;
	if (day==2 || day ==4){
		System.out.println("SDLC Class");
	} else if (day== 6 || day==7) {
		System.out.println("Java Class");
	}else if (day == 1 || day ==5) {
		System.out.println ("No class");
	} else if (day == 3) {
		System.out.println("Review Class");
	} else {
		System.out.println("Not a valid day");
	}
	//USE OF STRINGS
	String day1 = "Wednesday";
	if (day1.equals("Tuesday") || day1.equals("Thursday")){
		System.out.println("SDLC Class");
	} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
		System.out.println("Java Class");
	}else if (day1.equals("Monday") || day1.equals("Friday")) {
		System.out.println ("No class");
	} else if (day1.equals("Wednesday")) {
		System.out.println(("Review Class"));
	} else {
		System.out.println("Not a valid day");
	}
}
}
