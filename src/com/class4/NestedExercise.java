package com.class4;

public class NestedExercise {

	public static void main(String[] args) {
		//1.
		boolean diploma = true;
		double gpa = 3.2;
		if (diploma) {
			System.out.println("Congrats");
			if (gpa==3.5) {
				System.out.println("You are eligible for scholarship");
			}else {
				System.out.println("You should have studided harder");
			}
		}else {
			System.out.println("Get a degree");
			
		}
//2.
		double mortgageRate = 3.2;
		double mortgagePrice = 2_500_000;
		
		if (mortgageRate>4.5) {
			System.out.println("I will NOT buy a house");
		}else { 
			System.out.println("I will consider buying it");		
			if (mortgagePrice >= 200_000) {
				System.out.println("I will take a loan");
			}else {
				System.out.println("I will pay cash");
			}
		}
		
	}

}
