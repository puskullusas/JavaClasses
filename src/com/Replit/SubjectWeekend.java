package com.Replit;

import java.util.Scanner;

public class SubjectWeekend {
	public static void main (String [] args) {
	  Scanner input;
	  boolean weekend;
	  String subject;
	  
	  input = new Scanner (System.in);
	  
	  System.out.println ("Is it weekend?");
	  weekend = input.nextBoolean();
	  
	  if (!weekend){
	    subject = "Manual Testing";
	    }else{
	      subject = "Java";
	    }
	  System.out.println ("Today you will be learning " + subject);
	}}
/*For you to do:
Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="Manual testing"
Otherwise --> subject="Java"

Output: 
"Today you will be learning ____"*/