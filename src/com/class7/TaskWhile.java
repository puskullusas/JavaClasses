package com.class7;

public class TaskWhile {
	public static void main(String[] args) {

		// i want to print all even numbers from 1-20
		// solution #1 - increment value by 2
		/*int z = 2;
		while (z <= 10) {
			System.out.println(z);
			z += 2; // should be inside loop to avoid infinite loop
		}*/
		
		// solution #2 - using mod and if else statement
	/*	int q = 1;

		while (q <= 10) {
			if (q % 2 == 0) {
				System.out.println(q);
				
			}
			q++;
		}
		System.out.println("zZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");*/
		
		//Infinite loop, cannot break out of loop
		int z = 1;

		while (z <= 10) { // 1.cond is TRUE, -> goes to IF statement
			if (z % 2 == 0) { // 2.cond is FALSE -> goes back as 1 to
								//while block and again and again
								//cause there is no increment
								//increment inside if block is not 
								//executed because if statement is
								//FALSE
				System.out.println(z);
				z++;
			}
			
		}
		System.out.println("zZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
	}}

	
