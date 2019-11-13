package com.class3;

public class TempCheck {
public static void main (String []args) {
	int t = 35;
	int reqT=32;
	
	//if (t==reqT) {//if 35==32//
	if (t<=reqT) {
		System.out.println("Water will freeze with t " + t);
	}else {
		System.out.println("Water will NOT freeze with t " + t); 
	}
	
	boolean val = false;
	if (val) { //or if (val == true)
		System.out.println("Hello");
	}else {
		System.out.println("Bye");
	}
	
}
}
