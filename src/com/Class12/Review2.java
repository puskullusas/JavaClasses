package com.Class12;

public class Review2 {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="Hello"; //both have same object
		System.out.println(str1.equals(str2));//true
		System.out.println(str1==str2);//true
		String str3 = new String ("Bye");//comparing reference object variables
		String str4=new String ("Bye");//same object or different?
System.out.println (str3.equals(str4)); //true
//str4=str3; // this way they will become same object
System.out.println(str3==str4); //false

}}
