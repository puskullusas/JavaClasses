package com.Replit;

import java.util.Scanner;

public class Task103charPrint {

	public static void main(String[] args) {
//		Write a for loop that will loop through every character of a word and print out each character, each on a separate line 
//		 Sample inputs/outputs:
//		In: hello
//		h
//		e
//		l
//		l
//		o
		
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	      char[] ch=word.toCharArray();
	    for(int i=0;i<ch.length;i++){
	    System.out.println(ch[i]);
	    }
//another way
	    for(int i=0;i<=word.length()-1;i++){
	        System.out.println(word.charAt(i));
	    }
	        //skipping every other character in word
	        for(int i=0;i<=word.length()-1;i+=2){
	            
		        System.out.print(word.charAt(i));
	        }
		        // other way
		        for(int i=0;i<=word.length()-1;i++){
		  	      System.out.print(word.charAt(i++));
	}
	}
}
