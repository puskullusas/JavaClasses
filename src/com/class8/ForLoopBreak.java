package com.class8;

public class ForLoopBreak {
public static void main (String [] args) {
	
	for (int i=0; i<10; i++) {
		
		if (i==5) {
			break;//majority of times used within if statement, stops the program @5and goes out of block
		}
		System.out.println(i);
	}
	System.out.println("I am outside the block");
}
}
