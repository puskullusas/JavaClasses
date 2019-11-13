package com.Class12;

public class Trim_CharAt_IndexOf {
public static void main (String []args) {
	/*This method appends one String to the end of another.
	 * the method returns a String with the value of the String
	 * passe in to the method appended to the end of the String used to invoke this method
	 */
	String str3 = "Hello ";//can add space for space inbtw words
	String str4 = "World ";
	String str5 = "People";
//one way
System.out.println(str3+str4);// try System.out.println(str4+" " + str3);
//another way to concatenate
System.out.println(str3.concat(str4));// or System.out.println(str3.concat(" " + str4));
System.out.println(str3.concat(str4).concat(str5));
//System.out.println(str4+str4);//

//this method returns a copy of the string with leading and trailing whitespace omitted
 	String str6= " How are you? ";
 	System.out.println(str6);
 	System.out.println(str6.trim());
 	
 // this method returns the character located at the String's specified index.
 	 // the string indexes start with zero
 	 String str7 = "We might be done early today";
 	 System.out.println(str7.length()); //28
 	 System.out.println(str7.charAt(4));// at index 4 there is value of i
 	 
 //returns the index within this string of the first occurrence of the specified character or -1 if the 
 	 //character does not occur.
 	 System.out.println(str7.indexOf('i'));//first occurrence
 	 System.out.println(str7.indexOf('e', 11));// after index 11
 	System.out.println(str7.indexOf('z', 2));// will give -1 cause there is no z
 	
}
}
