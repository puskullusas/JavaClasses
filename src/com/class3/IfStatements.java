package com.class3;

public class IfStatements {
	public static void main (String []args) {
		
		int a=20;
		int b=30;
		// if number a is bigger the number b\
		//i want to print a is larger than b
		
		if (a>b) {
			System.out.println("a is larger than b"); //false
		}else {
			System.out.println("a is smaller than b");//true
		
		}
		double tea$=4.99;
		double allow$=5.99;
		//tea$-=2; //2.99=4.99-2
		//if price is more than i can afford and i will NOT buy
		//if price is less or matches what i can afford then i will buy tea
		
		if (allow$>=tea$) {
			System.out.println("I will buy my Tea");
		System.out.println( "And i will enjoy my Tea");
		}else { 
			System.out.println("I cannot afford");
			System.out.println("I will go back to study more");
			
		}
		System.out.println("I keep writing some code");//this will print disregarding the condition
														// cause it is not in the if block
	}

}
