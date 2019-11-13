package com.Replit;

import java.util.Scanner;

public class Mod {
	public static void main (String [] args){
		  
		  Scanner input = new Scanner (System.in);
		  		  
		  System.out.println ("Please enter a number");
		
		  int num = input.nextInt();
		  int res = num%2;
		  if(res==0){ //nested if
		    System.out.println ("Value is even");
		    if (num >100) {
		    System.out.println ("Value is too large");
		    }else {
		    System.out.println ("Value is just right");
		    }
		  }else {
			  if (num <100){// else icinde nested if again
		 		    System.out.print("Value is just right and is an odd number");
		    }else {
		      System.out.println ("This is an odd number and value is too high");
		   		  }
}
}
}