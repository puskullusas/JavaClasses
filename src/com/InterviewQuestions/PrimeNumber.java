package com.InterviewQuestions;

import java.util.Scanner;

public class PrimeNumber {
	public static void main (String [] args) {
	// 5*1=5, 3*1=3,2*1=2; etc
	//Write a program that prompts the user to input a positive integer. 
	//It should then output a message indicating whether the number is a prime number. 
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
         int num =sc.nextInt();
          boolean prime = true;
          if(num==0 || num==1){ //num!=0 && num!=1
              prime=false;
        }else {
          for(int i1 = 2; i1 <= num/2; ++i1){
          if(num % i1 == 0){
              prime = false;
              break;
          }}
         }if (prime)
         System.out.println(num + " is a prime number.");
        else
         System.out.println(num + " is not a prime number.");
          }
		
	}

