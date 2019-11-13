package com.class13;

public class SplitAnotherEx {

	public static void main(String[] args) {
		String str = "Welcome To Syntax Technologies";
		String [] array2= str.split (" ",2);// 
		System.out.println(array2.length);
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		
	}

}
