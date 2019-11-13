package com.class8;

public class ForLoopsContinue {
public static void main (String [] args) {
	//CONTINUE --> skip current iteration
	for (int i=1; i<=5; i++) {
		if (i==2||i==4) {//if we use && the condition 
			//or (i>=2 && i<=4)\\cannot be at the same time WITH one variable
			continue;
		}
	System.out.println(i);
}
	System.out.println("**************************");
	
}}
