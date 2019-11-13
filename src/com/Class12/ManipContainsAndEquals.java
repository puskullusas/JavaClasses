package com.Class12;

public class ManipContainsAndEquals {
	public static void main (String [] args) {
		
		//.contains(); -> method
		
		String sentence = "It was raining today";
		System.out.println(sentence.contains("Was"));//false, cause there is no capitalized "Was"
		System.out.println(sentence.contains("was"));//true
		
	//Task
		/* create two Strings and initialize them with some value.
		 * implement the following methods on those strings
		 */
		//.contentEquals();
	String str1="hello world";
	String str2="HElLo WoRlD";
		
	boolean isEqual=str1.contentEquals(str2);
	System.out.println (isEqual);
	
	//.equalsIgnoreCase();
	System.out.println(str1.equalsIgnoreCase(str2));
		//task
//		String ayshe = "Aisha";
//		String ayshe1="AISHA";
//		String bebe = "BEBE";
//		System.out.println(ayshe.length());
//		System.out.println(ayshe.contains ("b"));
//		System.out.println(ayshe.toUpperCase());
//		System.out.println(bebe.toLowerCase());
//		System.out.println(ayshe.equalsIgnoreCase(ayshe1));
//		boolean isEqual = ayshe.contentEquals(bebe);
//		System.out.println(isEqual);
	}

}
