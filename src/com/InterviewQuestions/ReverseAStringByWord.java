package com.InterviewQuestions;

public class ReverseAStringByWord {

	public static void main(String[] args) {
		//to reverse string
		//step 1: using split method->array of strings
		 // step 2: use for loop to print elements by decrementing
//		 String str2="Today is very cold outside";
//		 String[] str=str2.split("\\s");
//			for (int i=str.length-1; i>=0; i--) {
//			  System.out.print(str[i]);
// another way
 String given = "Welcome to the Java Class";
String reversed="";
	String[] str1 = given.split ("\\s");
	for (int j =str1.length-1; j>=0;j--) {
	reversed=reversed+str1[j] + " ";
	}
			System.out.println(reversed);
	//reverse a string using CharAt
			String str="Java Classes";
		    for(int i=str.length()-1 ; i>=0 ; i--) {
		         System.out.print(str.charAt(i));
		     }
		         System.out.println();
// reverse a string using toCharArray;
		         String s="susamis sularin akisi gibi";
		         char [] s1=s.toCharArray();
		         for (int i = s1.length-1; i >=0 ; i--) {
		             System.out.print(s1[i]);
		         }
		         System.out.println();
	}
}
