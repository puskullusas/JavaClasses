package com.Replit;

import java.util.Scanner;

public class LogicalOpertrs {
public static void main (String []args) {
	Scanner input = new Scanner (System.in);
	 String word1, word2;
	  int num1, num2;

	  System.out.println ("Please enter two strings");
	  word1= input.nextLine();
	   word2= input.nextLine();
	    System.out.println ("Please enter two numbers");
	    num1 = input.nextInt();
	    num2 = input.nextInt();
	    
	    if (num1==num2 && word1.equals(word2)){
	      System.out.println ("AND");
	    }else if (num1 == num2 || word1.equals(word2)){
	      System.out.println ("OR");
	   }else if (!(num1 == num2) && (!(word1.equals(word2)))){
	    System.out.println ("NONE");
	    }
	}
	}
