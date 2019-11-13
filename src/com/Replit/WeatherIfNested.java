package com.Replit;

import java.util.Scanner;

public class WeatherIfNested {
	public static void main (String [] args){
	    Scanner input = new Scanner (System.in);
	    
	    boolean isSunny;
	    int temp;
	     isSunny = input.nextBoolean();
	     
	     
	     if (isSunny){
	     System.out.println ("It is a sunny day, I should go somewhere!");
	     temp = input.nextInt();
	     if (temp>85){
	       System.out.println ("I am going to the beach");
	     }else{
	       System.out.println ("I am going to the park");
	     }
	     }else{
	       System.out.println ("I stay at home and practice Java");
	     }
	    
}
}
