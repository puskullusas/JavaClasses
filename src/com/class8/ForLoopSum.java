package com.class8;

import java.util.Scanner;

public class ForLoopSum {
public static void main (String [] args) {
	//WHEN WE KNOW EXACTLY HOW MANY TIMES REPETITION
	//IS GOING TO BE --> USE FOR LOOP
	//say good morning 5 times// \
	//variable 'i' is local to one loop, "it dies within:)"
	/*for (int i=0; i<=4; i++) {
		System.out.println("Good morning");
	}
	//2
	for (int i = 0; i<=50; i+=5) {
		System.out.println(i);
	}*/
	
	/*int sum = 0; //declaration and initialization
	for (int i=1; //initialization executed only one time at the beginning
			i<=5; //condition check step executed before for-loop body
			i++) //update step executed after for-loop body
	{
		//int sv=0;//this variable will stay the same for next loop, and start all over with sum
		//sv++;
		
		System.out.println(sum);//prints 5 times the sum
		sum = sum+i;
	}
		System.out.println(sum);*/
//ANOTHER EXAMPLE USING SCANNER< INPUT FROM OUTSIDE
	
	
	Scanner input = new Scanner (System.in);
	
	//ADDItion of 6 entered NUMBERS
	
	int sum = 0; //will be end product of out summary
	int i; //this doesn't play any part in addition, just to repeat the process
	int n; // this will be the input from outside world:)
	
	for (i = 0; i<=5; i++) { //this will let us input integer 6 times!!!
		System.out.println("Enter number");//command to input next integer, followed by prompt
		n=input.nextInt();// input from outside
		sum = sum+n; // sum of entered numbers
	}
	System.out.println("Total sum is " + sum); //clothing output to show total sum
		
	}
	
	
}
