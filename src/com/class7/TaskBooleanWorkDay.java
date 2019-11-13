package com.class7;

public class TaskBooleanWorkDay {
	public static void main(String[] args) {

		/*
		 * create int variable day and assign it to 1, as log as it is workDay print "I
		 * need a day off' once day is 6 print "i don need a day off anymore"
		 */
		boolean workDay = true;
		int day = 1;

		while (workDay) {						//1.is TRUE-> goes inside and , 
												//if FALSE -> goes outside while block to Let's work!!!!
			System.out.println("need a day off"); //2.executes and --> checks IF condition
			if (day == 6) { 						//3. cond is FALSE -->does not execute IF Block, if TRUE
				System.out.println("I don't need a day off anymore"); //executes this line and goes to 
															//next line and then up to While block	
															//to start over to check condition
				workDay = false;  // break; can be used instead of changing value to false
					}
				day++; //4. increments 1+1==>2; goes up to While block
		}
		System.out.println("Let's work!");
	}
}
