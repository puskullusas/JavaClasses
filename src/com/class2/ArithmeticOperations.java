package com.class2;

public class ArithmeticOperations {
	public static void main (String [] args) {
	 /*
	  * declare 2 variables and initialize them
	  * perform addition, subtraction, multiplication and division
	  */
		int num1, num2;
		num1 = 20;
		num2 = 10;
		
		System.out.println(num1+num2); //30
		System.out.println (num1-num2);//10
		System.out.println (num1*num2);//200
		System.out.println (num1/num2);//2
		
		// how can we print value of num1 and num2 together
		System.out.println(num1+"+"+num2);
	
		//another way
		int sum=num1+num2;//30
		int sub=num1-num2;
		int mult = num1*num2;
		int div = num1/num2;
		System.out.println(sum); 	
		
		//example: the addition of 2 number is_
		
		System.out.println ("The addition of 2 numbers is "+ sum);
		System.out.println ("The division of 2 numbers  is " + div);
		System.out.println ("The addition of 2 numbers is " + (num1+num2));
		
}
}