package com.class3;

public class RelationalOps {
	public static void main (String [] args) {
		
		//the result of relational and equality operators is BOOLEAN false or true;
		int nm1=20;
		int nm2=19;
		System.out.println(nm1>nm2);//true
		System.out.println(nm1<nm2);//false
		
		double d=1.99;
		 double d1=2.93;
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		
	}

}
