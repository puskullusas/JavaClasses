package com.class11;

public class Review {
	public static void main (String [] args) {
//enhanced/advanced loop to extract values from arrays and collections.
int [] array = new int [6];
array [0] = 33;
int [] arrayList = {2, 3, 4,5};  
//1 way to print all values of array is
// for(int g=0; g<array.length; g++){
//System.out.println(array[g]);
 
// 2 way
for (int element: arrayList) {// prints all values
	 System.out.println(element); //one element of array in iteration
 }
		
		
		
	}
}
