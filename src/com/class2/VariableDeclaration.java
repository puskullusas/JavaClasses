package com.class2;

public class VariableDeclaration {

	public static void main (String [] args ) {
		
		//1. declaring variable num1 that will hold value of int and 
		// assigning/initializing value of 123 to it
		int num1 = 123;
		int num2 = 234;
		int num3 = 23432;
		
		//2. declare variable first and then assign value
		int n1;
		int n2;
		int n3;
		
		n1 =56;
		n2 = 34534;
		n3 = 435345;
		
		//3. declare all variables together and then assign value
		int number1, number2, number3;
		number1 =12;
		number2 = 23;
		number3 = 45;
		System.out.println (number3);
		
		number3= 1000;
		System.out.println(number3);
		
		boolean var = true;
		System.out.println(var);
		
		char myVariable;
		myVariable = '*';
		System.out.println(myVariable);
		
		number2 = number1; //12
		System.out.println(number2);
		// number 2 = false; -> compile an error
		
		//variables can be declare only ONCE
		//you MUST put appropriate values of specified datatype ONLY
		//values of variables can be changed later in the program
		//we can use values of other variables to initialize another variable
		//example boolean isRain = false;
		//		boolean isSnow;
		//		isSnow = isRain; //-> isSnow = false
		
		
		
		
		
		
	}
}
