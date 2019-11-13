package com.Replit;

public class Arrays73 {
public static void main (String [] args) {
	int[] arr = { 45, 78, 12, 67, 55 };

	for (int i = 0; i < arr.length; i++) {

		System.out.print(arr[i] + " ");
		
		//Write a program that creates an array of integers that stores the following values: 
		//45,78, 12,  67, 55, 89, 23, 77, 88
		//Print only values that stored with even index including 0.
		int [] a = new int [9];
	    a[0]=45;
	    a[1]=78;
	    a[2]=12;
	    a[3]=67;
	    a[4]=55;
	    a[5]= 89;
	    a[6] = 23;
	    a[7]= 77;
	    a[8] = 88;
	    for (int b = 0; b < a.length; b++) {
	    if (b%2 ==0){
			System.out.print(a[b] + " ");
//or
			int[] arrs = {45,78, 12,  67, 55, 89, 23, 77, 88};

			for (int g = 0; g < arrs.length; g+=2) {

				System.out.print(arrs[g] + " ");
			}
}}}}
}
