package com.class5;

public class LogicalNot {
public static void main (String [] args) {
	boolean b1=! true;
	boolean b2=! false;
	
	System.out.println(b1);
	System.out.println(b2);
	
	boolean traffic =true;
	if (!traffic) {// if there is no traffic
		System.out.println("On time");
	}else {
		System.out.println("Late");
	}
	
	boolean isRain = false;
	if(!isRain) {
		System.out.println("Take an umbrella");
	} else {
		System.out.println("Dont'take an umbrella");
	}
	int num1=10;
	int num2=10;
	
	if (num1==num2) {
		System.out.println("Numbers are equal");
	}else {
		System.out.println("Numbers are not equal");
	}
	if (!(num1==num2)) {
		System.out.println("Numbers are NOT equal");
	}else {
		System.out.println("Numbers are equal");
	}
	//using STRING
	String name = "Helen";
	String name1 = "July";
	  // true or false --> true and NOT --> false
	if (!(name.equals ("Mary") || name1.equals("Anna"))) {
		System.out.println("You are not my sister");
	}else {
		System.out.println("You are my sister");
	}
}

}
