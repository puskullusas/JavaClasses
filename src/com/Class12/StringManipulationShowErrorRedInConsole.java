package com.Class12;

public class StringManipulationShowErrorRedInConsole {
	public static void main (String []args) {
		
	//	you can copy contents of another document and paste into new class
		
		int a=2;
		if(a==20) {
			System.out.println("Number is " + a);
		}else {
			System.err.println("Number was not 20 but is " + a); // to show error, and make it red
		}
	}

}
