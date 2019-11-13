package com.class3;

public class PrimitiveCasting {
	public static void main (String [] args) {
		 // CASTING - changing/converting one type to another
		
		double d=12;
		System.out.println(d);
		// int i=12.0; compile time error
		
		
		//byte --> short --> int --> long==> float --> double
		
		
		//1.Widening (Implicit/Automatic), storing smaller numbers into bigger
		
		byte b =127;
		int i=b;
		
		int num =123;
		double d1=num;
		System.out.println(d1);
		 //2. Narrowing (Explicit/Manual)
		
		double d2=123.56;
		//int num2=d2; shows error
		int num2=(int)d2;// to cast smaller into bigger add parenthesis with variable before value
		System.out.println(num2);
		
		int num3=1000;
		byte b1=(byte)num3;
		System.out.println(b1);
		
		int a12=5;
		   int b12 =2;
		   int total = a12/b12;
		   System.out.println (total);
		
		
	}
	

}
//