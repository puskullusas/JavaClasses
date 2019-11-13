package com.class13;

import java.util.Scanner;

public class NameSuggestProgram {

	public static void main(String[] args) {
//		Write a program that reads two people's first names and if they expecting boy or girl? 
//		Based on the input suggests a name for a baby:
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? boy
//		Suggested baby name: DANRY
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is mom's first name?");
		String mom= input.nextLine();
		System.out.println("What is dad's first name?");
		String dad=input.nextLine();
		System.out.println("Is it Boy or girl?");
		String gender = input.nextLine();
		
		if (gender.equalsIgnoreCase ("boy")) {
			System.out.println(dad.substring(0,3).concat(mom.substring(mom.length()-2, mom.length())));
		}else if (gender.equalsIgnoreCase("girl")) {
			System.out.println(mom.substring(0,2).concat(dad.substring(dad.length()-3, dad.length())));
		
			
		        System.out.println("Enter moms name");
		         String momsname=input.nextLine();
		         System.out.println("Enter dads name");
		         String dadsname=input.nextLine();
		         System.out.println("enter baby gender");
		         String gend=input.nextLine();
		         
		         int m=momsname.length()/2;
		         int d=dadsname.length()/2;
		         int mEnd=momsname.length();
		         int dEnd=dadsname.length();
		         if(gend.equalsIgnoreCase("Boy")) {
		            System.out.println(dadsname.substring(0,d)+momsname.substring(m,mEnd));
		         }else {
		             System.out.println(momsname.substring(0,m)+dadsname.substring(d,dEnd));
		         }
		
		}
	}

}
