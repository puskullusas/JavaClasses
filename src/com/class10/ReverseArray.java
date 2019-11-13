package com.class10;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
//		
//		String [] animals = {"dog", "cat", "mouse"};
//		for (int i= animals.length-1; i>=0;i--) {
//			System.out.println(animals[i]);
//	}
// another example
		
		
		String [] strArr = new String [8];
		
		Scanner input = new Scanner (System.in);
		
	int index = 0;
	String name = "";
	do {
		System.out.println("Enter names, until STOP");
		name = input.nextLine();
		strArr[index]=name;
		index++;
	}while (index < strArr.length && !name.equalsIgnoreCase("stop"));
	System.out.println("_____________");
	}
}
