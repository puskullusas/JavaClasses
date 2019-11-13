package com.Class12;

public class Equals_Upper_LowerCase {
	public static void main (String []args) {
		
		String str = new String();
		// there are two ways to create String objects
		//1 String Literal;
		String name = "Jhon";
		System.out.println(name);
		System.out.println(name.length());//size of name Jhon = 4 elements
		//2 Creating String with new keyword
		String name1=new String ("John1");
		
		//the length is equal to the number of 16-bit Unicode characters in the string.
		 
		int name1Len=name1.length();//this method returns the length of this string.
		System.out.println (name1Len);
		
		String str1 = "Hello world";
		String newValOfstr1=str1.toLowerCase();//stored into new variable
		 System.out.println(str1.toLowerCase());//not stored
		 System.out.println(str1);
		
		//.contentEquals()
		String str2="HElLo WoRlD";
		boolean isEqual=str1.contentEquals(str2);
		System.out.println (isEqual);
		
		// .equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		
		// upper case
		String str3 = "Mohammad";
		str3=str3.toUpperCase();// all upper case
		System.out.println(str3);
		
		
	}

}
