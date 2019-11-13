package com.class4;

public class NestedIf {
	public static void main(String[] args) {
 
		//Nested if is if statement inside another if statement
		
		boolean b=true;//try false
		boolean classToday = true; //try false
		if (b) {
			System.out.println("Hello");
			if (classToday) {
				System.out.println("Hello my friends");
			}
		}else { 
			System.out.println("Bye");
		}
		
		boolean isFriday=true;// try false
		int day = 13;
		// if today is Friday only day i want to check it it day is 13th.
		if(isFriday) {
			System.out.println("Today is Friday");
			if(day==13) {
				System.out.println("I will whatch scary movie");
			}
		}else {
			System.out.println("Today is NOT Friday");
		/* check age, if age is less than 16 --> you are too young to drive
		 * otherwise --> you are eligible to drive & we will check
		 * if you are older than 18 -->
		 * you can get driver license  and if not you can get driver permit
		 */
		int age=18;// play with numbers 
		if (age <16) {// 15<16
			System.out.println("You're too young to drive");
		}else {
			System.out.println("You're eligible to drive");
			if (age>=18) {
				System.out.println("You can drive alone");
			}else {
				System.out.println("You need your parents to drive");
			}
		}
		System.out.println("___________________");
		/*we need to check if student completed the quiz
		 * if yes --> good job. if not --> go back and finish
		 * if they completed,we will check score:
		 * if more than 90-->you got an A
		 * if more than 80 --> you got B
		 * anything else --> study more	 */
		boolean quiz=true;
		int score = 89;
		if (quiz) {
			System.out.println("Good Job!");
		if (score >=90) {
			System.out.println("You got an A");
		}else if (score>80) {
			System.out.println("You got a B");
		}else {
			System.out.println("You should study more");
		}
		}else {
			System.out.println("Go back and finish");
		}
		
	}
}}
