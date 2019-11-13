package com.class13;

import java.lang.reflect.Array;

public class SplitMethod {
public static void main (String [] args) {
	
	String str= "Video provides a powerful way to help you prove your point.";
	String[] array=str.split (" "); //or \\s //splits by finding empty space
	for (int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
		// how can we find how many sentences are in the following string?// we can split by finding periods (.)
		String str1= "Today is Sunday. It's sunny day. And we are having java class";
		String [] arr2 = str1.split("\\.");//period is not considered regex
		for (String string:arr2) {
			System.out.println(string);//System.out.println(string.trim());
		}
			System.out.println("The number of sentences in the "+
			"given string is:" + arr2.length);
	// split by comma	
	String str3= "If you come to class early, "
			+ "then you can study more, "
			+ "also you can learn more, "
			+ "and you can leave early";
			String [] array1 =  str3.split(",");
			for (int i = 0; i<array1.length; i++) {
				System.out.println(array1[i]);
			}
	}
}

