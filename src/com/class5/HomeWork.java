package com.class5;

public class HomeWork {
public static void main (String [] args) {
	
	/*Write a program that will read three inputs of
	scores (quiz, mid term, and final scores) and
	determine the grade based on the following
	rules:
	if the average score >=90 
	 grade=A
	if the average score >= 70 and <90 
	 grade=B
	if the average score>=50 and <70 
	 grade=C
	if the average score<50 
	 grade=F*/
	
	int quiz, midTerm, finalScore;
	quiz = 40;
	midTerm = 40;
	finalScore=30;
	
	int average = ((quiz+ midTerm + finalScore)/3);
	String grade;//OR String grade=null; and at the end there is no value
		
	if (average >=90 ) {
		grade = "A";
	}else if (average >=70 && average <=90 ) {
		grade = "B";
	}else if (average >=50 && average <=70 ) {
		grade = "C";
	}else{
	grade = "F";
	}
	System.out.println(grade);
}
}


