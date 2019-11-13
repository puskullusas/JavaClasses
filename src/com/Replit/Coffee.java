package com.Replit;

import java.util.Scanner;

public class Coffee {
public static void main (String []args) {
	Scanner input;
	input = new Scanner (System.in);
	String drink;
	boolean thirsty, sleepy;
	
	System.out.println ("Are you thirsty?");
	   thirsty = input.nextBoolean();
	  System.out.println ("Are you sleepy?");
	  sleepy = input.nextBoolean();
	 
	 if (thirsty && ! sleepy){
	   drink = "Water";
	 } else if (thirsty && sleepy){
	  drink = "Coffee";
	 }else if (!thirsty && sleepy) {
		 drink = "Tea";
	 }else {
		 drink = "Nothing";
	 }
	 System.out.println ("Looks like you need "+ drink);
}
}
/*Take 2 boolean inputs from a user:

"Are you thirsty?"
"Are you sleepy?"

If user is thirsty and not sleepy--> drink=Water
If user is thirsty and sleepy--> drink=Coffee
If user is not thirsty and sleepy --> drink=Tea
Otherwise drink="Nothing"

Output:
"Looks like you need ___ "*/