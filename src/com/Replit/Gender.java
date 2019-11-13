package com.Replit;

import java.util.Scanner;

public class Gender {
	 public static void main (String [] args){
		    
		    Scanner input = new Scanner (System.in);
		   
		   /*System.out.println("Gender");
		    char gender = input.next().charAt(0);
		    
		    System.out.println("Age");
		    int age = input.nextInt();
		   
		    if (age >25){
		    if (gender == 'F'){
		      System.out.println( "Woman");
		    }else if (gender == 'M'){
		    System.out.println ("Man");
		    }
		  }else{
		    if (gender == 'F'){
		    System.out.println ("Girl");
		    }else if (gender == 'M') {
		    System.out.println ("Boy");
		 
	}*/
		    
		 String gen = input.nextLine();
		       
		    int ag = input.nextInt();
		   		      
		    	 if( ag>25) {
		    		 if (gen.equals ("F")){
		      System.out.println( "Woman");
		    	 }else if (gen.equals("M")){
		    	  System.out.println ("Man");
		      }
		    }else {
		    	if (gen.equals("M")) {
		    	System.out.println ("Boy");
		  		  }else if (gen.equals("F")){
		    
		    	System.out.println ("Girl"); 
		   
		  }}}}

