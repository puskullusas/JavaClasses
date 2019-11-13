package com.Replit;

public class Array87printElementsofIndexofRow {
public static void main (String []args) {
	int[][] a = {
		{-5,-2,-3,7},
		{1,-5,-2, 2},
		{1,-2, 3,-4}
	};
	
	int sum = 0;
		for (int b=0; b<a.length; b++){
			sum+=a[b][1];//col 1
  
}
System.out.println (sum);// prints sum of col 1//should print -9

//another solution
int column = 1;
int sum1 = 0;
	for (int row = 0; row < a.length; row++) {
	sum1 += a[row][column];		
	}
	System.out.println( sum );
}}


