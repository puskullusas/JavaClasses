package com.class2;

public class StringExample {
	public static void main (String [] args){
		//String is class that represent sequence of character -> abc23 !NOT datatype
		//inclosed within ""
		String name ="John";
		String address = "123 Test Drive";
		String salary = "$150,000 US DOLLARS";
		String phoneNumber = "1235545425";
		String space = " ";
		//String birthDate = 12/12/2018;->we need to use quotations "12/12/2018
		System.out.println(name);
		String city = "Dallas";
		// My name is _
		// I live in city of _
		// My phone number is _
		System.out.println("My name is " + name);
		System.out.println ("I live in city of " + city);
		
	}

}
