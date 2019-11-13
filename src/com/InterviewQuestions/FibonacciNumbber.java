package com.InterviewQuestions;

public class FibonacciNumbber {

	public static void main(String[] args) {
		//first 10 numbers of Fibonacci
		int a,b,c;
		a=0;
		b=1;
		for (int i=0;i<10;i++) {
			System.out.println(a + " ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
