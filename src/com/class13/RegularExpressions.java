package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		//print only text without numbers
		String str = "172367Hello544253lk2342";
		System.out.println(str.replaceAll("[0-9]", ""));//prints only numbers, replaces letters 
System.out.println(str.replaceAll("[^0-9]","")); //to get only letters you can use karat ^ ->means not
	
	System.out.println(str.replaceAll ("[a-zA-Z]", ""));//covers Upper and Lowercase 
	
	//remove everything except text and numbers
	String str2 = "Hi$E&E&4544aff567";
	System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
	
	String str4="12-22-1990";
	System.out.println(str4.replace('-','/'));
	
	//we can use this instead all other replaceAll
	System.out.println(str2.replaceAll("\\W",""));//removes all characters leaves letters and numbers
	System.out.println(str2.replaceAll("\\w",""));//removes all numbers and letters
	
	String space="Today is Java class"; //replacing the space
	System.out.println(space.replace(" ", ""));//one way
	System.out.println(space.replaceAll ("\\s", ""));// another way
	
	String str6 = "1212314H465456ell46546o";// leaves out all numbers
    System.out.println(str6.replaceAll("[0-9]","")); // Leave only text
    System.out.println(str6.replaceAll("\\d", ""));// another way
    
    String doc="Video provides a powerful way to help you "
			+ "prove your point. When you click Online Video,"
			+ " you can paste in the embed code for the video you "
			+ "want to add. You can also type a keyword to search "
			+ "online for the video that best fits your document.";
	
	System.out.println(doc.toLowerCase().replace("video", "Audio"));
	System.out.println(doc.replaceAll("powerful(.*)", ""));
	
	}

}
