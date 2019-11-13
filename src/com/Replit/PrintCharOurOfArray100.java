package com.Replit;

public class PrintCharOurOfArray100 {
public static void main (String [] args) {
//	Create a String named "Welcome To Syntax Solutions".
//	Convert the String into array and using toCharArray method print all values. 
//	Output should be like :
//
//	W
//	e
//	l
//	c
//	o
//	m
//	e
	
	String str1="Welcome To Syntax Solutions" ;
	    int  size =str1.length();
	   // System.out.println(size); 
	    char [] sentence = new char [size];
	    
	   str1.getChars (0,size, sentence, 0);
	for (int i=0; i<size; i++) {
	   System.out.println(sentence [i]);
	}
	// another way
	char[] ch=str1.toCharArray();
    for(int i=0;i<ch.length;i++){
    System.out.println(ch[i]);
    
    
}
}}
