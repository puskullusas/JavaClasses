package com.class2;

public class Modulus {
	public static void main(String[] args) {
	
		/*float n1 = 12.5f;
		float n2 = 2.2f;
		
		float div=n1/n2;
		System.out.println(div);
		
		int num1=13;
		int num2=2;
		double divOfInt = num1/num2;
		System.out.println (divOfInt);
		
		double d=12;
		System.out.println (d);*/
		// int i=12.5; cannot convert from double
		
		//modulus gives the remainder of the division
		
		/*int a=15;
		int b = 9;
		int remainder=a%b;
		System.out.println (remainder);*/
	// 6 % 4 = 2   --> 6/4 = 1 so 6-(4*1) = 2
	//	11 % 5 = 1  --> 11/5 = 2 so 11-(5*2) = 1	
		
		int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 11;
	    int num6 = 5;
	    
	    //start coding here
	    int result1= num1+num2-num3;
	    int result2= num4*num5/ num6;
	    System.out.println(result1);
	    System.out.println(result2);
	    
	    int res = -21%4;
	    System.out.println (res);
	   
	  // int blank3 = result1%result2;
	  // System.out.println(blank3);
	   // System.out.println (result2 + " modded by " + result1 + " is " + blank3);
}
}
