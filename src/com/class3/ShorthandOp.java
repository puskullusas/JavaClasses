package com.class3;

public class ShorthandOp {
	public static void main (String [] args) {
		
		//shorthand operators
		
		int num = 1000;
		num = num+1000;
		System.out.println (num);
		
		int num2=10;
		num2=num2-5;
		System.out.println (num2);
		
		int num3=1000;
		num3+= 1000; // num3=num3+1000;
						// shortcut for printing syso+ctrl+space
		int num4=50;
		num4+=20; // num4=num4+20
		System.out.println(num4);
		
		num4-=30; //num4=70-30
		System.out.println(num4);
		
		num4/=10; // num4=40/10
		System.out.println(num4);
		
		num4%=2; num4=4%2;
		System.out.println(num4);
		
		int incr = 45;
		incr+=100;
		System.out.println(incr);
		
		int decr = 167;
		decr-=67;
		System.out.println(decr);
		
		int cakePiece1 = 11;
		cakePiece1/=4;
		System.out.println(cakePiece1);
		
		int cakePiece = 25;
		//cakePiece/=7;
		int leftOver =7;
		cakePiece%=7;
		System.out.println(cakePiece);
		
		
		
		
		
		
		
	}

}
