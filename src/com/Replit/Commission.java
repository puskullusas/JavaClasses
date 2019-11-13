package com.Replit;

import java.util.Scanner;

public class Commission {
	public static void main (String [] args) {
	 Scanner input;
	    input = new Scanner (System.in);
	    
	    System.out.println ("Please enter a number");
	    int num = input.nextInt();
	     if (num >=400){
	       if (num <=600){
	         System.out.println ("Don't calculate commission");
	       }else if (num>600){
	         System.out.println ("Value is too large");
	       }
	     }else{
	       System.out.println ("Calculate commission");
	     }
}
}