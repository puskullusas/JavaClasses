package com.Replit;

public class ForLoop69 {
	public static void main(String[] args) {
//		Write a program to print out the pattern: 
//	        1
//	       22 
//	      333 
//	     4444 
//	    55555		
//		for (int i = 1; i <= 5; i++) {
//			for (int b = 4; b >= i; b--) {
//				System.out.print(" ");
//			}
//			System.out.println(i);
//		}
//		
//		for (int a = 1; a<5; a++) {
//			System.out.print(" ");
//				
//							
//						}}}
//				
		int val = 5;
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= val - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println("");
        }}}
		
		// 1. assign and check -> i=1, i<=5 true
		// 2. goes into 2nd forLOOP, assign and check -> b=1, b<=i -> 1==1; true
		// 3. print b => 1;
		// 4. b++ => b+b => 1+1=2; b==2;
		// 5.checks condition b<=i(1)-> 2<=1? ->false
		// 6. exits 2nd.forLoop and prints empty lane of 1st forLoop
		// 7. increments i++ of the 1st forLoop. i=2 now!
		// 8. check condition of 1st fLoop. i(2)<=5; true
		// 9.goes inside 2nd fLoop.

	

