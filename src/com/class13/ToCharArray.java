package com.class13;

public class ToCharArray {

	public static void main(String[] args) {
		// .toCharArray()
		//this method converts string to a new character array
		 
		String str= "Syntax";
		
		char[]arr=str.toCharArray();
		for (char i:arr) {
			System.out.println(i);
			
		}
	}

}
